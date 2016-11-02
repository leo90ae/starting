package hello;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

/**
 * Created by leo on 02/11/16.
 */
public class Marker {
    @Id
    private ObjectId id;

    private Double lat;
    private Double lng;
    private String tag;
    private String vicinity;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVicinity() {
        return vicinity;
    }

    public void setVicinity(String vicinity) {
        this.vicinity = vicinity;
    }
}
