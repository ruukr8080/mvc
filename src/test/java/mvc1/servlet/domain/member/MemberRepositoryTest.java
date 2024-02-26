package mvc1.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;

class MemberRepositoryTest {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void afterEach() {
        memberRepository.clearStore();
    }

    @Test
    void save() {
        //given
        Member member = new Member("hi", 20);
        //when
        Member saveMember = memberRepository.save(member);
        //then
        Member findMemberId = memberRepository.findById(saveMember.getId());
        Assertions.assertThat(findMemberId).isEqualTo(saveMember);
    }


    @Test
    void findAll() {

        //given
        Member m1 = Member.builder().age(1).name("a").build();
        Member m2 = Member.builder().age(2).name("b").build();
        Member m3 = Member.builder().age(3).name("c").build();
        Member m4 = Member.builder().name("d").age(4).build();


        Member saveM1 = memberRepository.save(m1);
        Member saveM2 = memberRepository.save(m2);
        Member saveM3 = memberRepository.save(m3);
        //when
        List<Member> members = memberRepository.findAll();
        members.add(m4);
        //then

        Assertions.assertThat(m1).isEqualTo(saveM1);
        Assertions.assertThat(m2).isEqualTo(saveM2);
        Assertions.assertThat(m3).isEqualTo(saveM3);
        Assertions.assertThat(members.size()).isEqualTo(4);
        Assertions.assertThat(members).contains(m1,m4);


    }
}
