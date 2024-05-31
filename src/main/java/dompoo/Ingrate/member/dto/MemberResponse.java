package dompoo.Ingrate.member.dto;

import dompoo.Ingrate.member.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MemberResponse {

    private final Long id;
    private final String username;

    public MemberResponse(Member member) {
        this.id = member.getId();
        this.username = member.getUsername();
    }
}
