package com.company.testwork.security;

import com.company.testwork.entity.Note;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "NoteRedactor", code = NoteRedactorRole.CODE)
public interface NoteRedactorRole {
    String CODE = "note-redactor";

    @EntityAttributePolicy(entityClass = Note.class, attributes = {"text", "name", "owner", "id", "*"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Note.class, actions = EntityPolicyAction.ALL)
    void note();

    @MenuPolicy(menuIds = "Note.list")
    @ViewPolicy(viewIds = {"Note.list", "Note.detail"})
    void screens();
}