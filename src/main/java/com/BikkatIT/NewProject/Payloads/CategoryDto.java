package com.BikkatIT.NewProject.Payloads;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDto {
	
	@NotBlank
	@Size(min = 3, message = "title must be in min of 3 char and max in 10 char")
	private String categoryTitle;
	@NotBlank
	@Size(min = 3, message = "content must be in min of 3 char and max in 50 char")
    private String categoryContent;

}
