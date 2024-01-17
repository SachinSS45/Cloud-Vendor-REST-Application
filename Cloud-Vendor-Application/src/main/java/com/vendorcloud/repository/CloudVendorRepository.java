package com.vendorcloud.repository;

import com.vendorcloud.entities.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
    //if some methods are not available you can create custom methods

}
