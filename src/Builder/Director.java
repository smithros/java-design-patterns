package Builder;

public class Director {
    WebsiteBuilder builder;
    public void setBuilder(WebsiteBuilder builder){
        this.builder = builder;
    }
    Website buildWebsite(){
        builder.createWebsite();
        builder.buildCms();
        builder.buildPrice();
        builder.buildName();

        Website website = builder.getWebsite();

        return website;
    }

}
