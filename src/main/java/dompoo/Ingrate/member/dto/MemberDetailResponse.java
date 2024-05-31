package dompoo.Ingrate.member.dto;

import dompoo.Ingrate.config.enums.Rank;
import dompoo.Ingrate.member.Member;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class MemberDetailResponse {

    private final String username;
    private final Integer posts;
    private final Integer point;
    private final String rank;

    public MemberDetailResponse(Member member) {
        this.username = member.getUsername();
        this.posts = member.getPosts();
        this.point = member.getPoint();
        this.rank = Rank.getRank(member.getPosts(), member.getPoint());
    }
}
