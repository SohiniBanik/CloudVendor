package com.example.demo.repository;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Cloudvendor;

@Repository
public class CloudVendorRepository implements JpaRepository<Cloudvendor, String>{

	@Override
	public <S extends Cloudvendor> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cloudvendor> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cloudvendor> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Cloudvendor> findById(String id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Cloudvendor entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Cloudvendor> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cloudvendor> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Cloudvendor> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Cloudvendor> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Cloudvendor> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Cloudvendor, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Cloudvendor> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Cloudvendor> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<String> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cloudvendor getOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cloudvendor getById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cloudvendor getReferenceById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Cloudvendor> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
