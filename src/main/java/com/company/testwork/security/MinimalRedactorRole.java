package com.company.testwork.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "MinimalRedactorRole", code = MinimalRedactorRole.CODE)
public interface MinimalRedactorRole extends UiMinimalRole, NoteRedactorRole {
    String CODE = "min-redactor";
}
