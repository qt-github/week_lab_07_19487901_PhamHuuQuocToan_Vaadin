package vn.edu.iuh.fit.frontend.admin;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "", layout = MainLayout.class)
public class Home extends VerticalLayout {
    public Home() {
        add(new H1("Welcome to the Inventory Management System"));
        setAlignItems(Alignment.CENTER);
    }
}
