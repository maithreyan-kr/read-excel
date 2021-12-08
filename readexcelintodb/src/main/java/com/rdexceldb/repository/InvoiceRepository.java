package com.rdexceldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdexceldb.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
