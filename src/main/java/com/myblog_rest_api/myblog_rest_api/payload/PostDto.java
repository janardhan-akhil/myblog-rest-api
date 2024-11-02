package com.myblog_rest_api.myblog_rest_api.payload;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

    private Long id;

    @NotNull
    @Size(min = 2,message = "Post title should have at least 2 characters")
    private String title;

    @NotNull
    @Size(min = 10, message = "Post description should have at least 10 characters or more")
    private String description;

    @NotNull
    @NotEmpty
    private String content;



}