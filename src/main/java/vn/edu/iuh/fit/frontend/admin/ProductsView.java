package vn.edu.iuh.fit.frontend.admin;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.crudui.crud.impl.GridCrud;
import vn.edu.iuh.fit.backend.models.Product;
import vn.edu.iuh.fit.backend.services.ProductService;

@Route(value = "admin/products", layout = MainLayout.class)
@PageTitle("Products")
public class ProductsView extends VerticalLayout {
    public ProductsView(ProductService productService) {
        add(new H1("Products Management"));
        setAlignItems(Alignment.CENTER);
        GridCrud<Product> crudGrid = new GridCrud<>(Product.class, productService);
        add(crudGrid);
        setSizeFull();

    }
}
