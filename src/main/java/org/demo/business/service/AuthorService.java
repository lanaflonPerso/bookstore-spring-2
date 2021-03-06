/*
 * Created on 3 avr. 2014 ( Time 19:39:48 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package org.demo.business.service;

import java.util.List;

import org.demo.bean.Author;

/**
 * Business Service Interface for entity Author.
 */
public interface AuthorService { 

	/**
	 * Loads an entity from the database using its Primary Key
	 * @param id
	 * @return entity
	 */
	Author findById( Integer id  ) ;

	/**
	 * Loads all entities.
	 * @return all entities
	 */
	List<Author> findAll();

	/**
	 * Saves the given entity in the database (create or update)
	 * @param entity
	 * @return entity
	 */
	Author save(Author entity);

	/**
	 * Updates the given entity in the database
	 * @param entity
	 * @return
	 */
	Author update(Author entity);

	/**
	 * Creates the given entity in the database
	 * @param entity
	 * @return
	 */
	Author create(Author entity);

	/**
	 * Deletes an entity using its Primary Key
	 * @param id
	 */
	void delete( Integer id );


}
