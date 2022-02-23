package br.com.rocketseat.ex.interceptor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class User {
    private Long id;
    private String name;
    private String email;
}
