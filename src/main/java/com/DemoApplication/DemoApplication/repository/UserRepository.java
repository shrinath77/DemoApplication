

package com.DemoApplication.DemoApplication.repository;

import com.DemoApplication.DemoApplication.model.User;  // ✅ correct import
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {

}