package com.company.testwork.security;


import com.company.testwork.entity.Note;
import io.jmix.security.role.annotation.JpqlRowLevelPolicy;
import io.jmix.security.role.annotation.RowLevelRole;


@RowLevelRole(name = "User redactor note role", code = UserRedactorNoteRole.CODE)
public interface UserRedactorNoteRole {
    String CODE = "user-redactor-note-role";

    @JpqlRowLevelPolicy(entityClass = Note.class, where = "{E}.user = :current_user_id")
    void note();
}