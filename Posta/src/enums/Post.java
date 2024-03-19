package enums;

import java.util.List;
import java.util.Map;

public class Post {

    private final List<PostOfficeBox> postOfficeBoxes;
    private Map<Integer, Post> forwardMap;

    public Post(List<PostOfficeBox> postOfficeBoxes) {
        this.postOfficeBoxes = postOfficeBoxes;
    }
}
