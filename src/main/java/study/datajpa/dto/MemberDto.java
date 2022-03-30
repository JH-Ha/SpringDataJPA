package study.datajpa.dto;

import lombok.Data;

@Data
public class MemberDto {
    private Long id;
    String username;
    String teamName;

    public MemberDto(Long id, String username, String teamName) {
        this.id = id;
        this.username = username;
        this.teamName = teamName;
    }
}
