package Builder;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("VisitCard");
    }

    @Override
    void buildCms() {
        website.setCms("WORDPRESS");
    }

    @Override
    void buildPrice() {
        website.setPrice(200);
    }
}
