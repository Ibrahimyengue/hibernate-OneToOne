package com.ibrahimyengue.hibernateOneToOne.repository;

import com.ibrahimyengue.hibernateOneToOne.domain.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository  extends JpaRepository<Recipe, Long> {
}
