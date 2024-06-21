package com.company.testwork.view.note;

import com.company.testwork.entity.Note;
import com.company.testwork.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value = "notes", layout = MainView.class)
@ViewController("Note.list")
@ViewDescriptor("note-list-view.xml")
@LookupComponent("notesDataGrid")
@DialogMode(width = "64em")
public class NoteListView extends StandardListView<Note> {
}