package Builder;

public class EnterpriceWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("EnterpriceWebsite");
    }

    @Override
    void buildCms() {
        website.setCms("ALIFRESKO");
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
