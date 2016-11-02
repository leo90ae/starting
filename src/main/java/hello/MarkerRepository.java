package hello;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by leo on 02/11/16.
 */
@RepositoryRestResource(collectionResourceRel = "marker", path = "marker")
public interface MarkerRepository extends MongoRepository<Marker, Integer> {

    List<Marker> findById(@Param("id") Integer id);
}
