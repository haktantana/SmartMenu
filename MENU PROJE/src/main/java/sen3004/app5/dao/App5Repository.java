package sen3004.app5.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import sen3004.app5.model.Order;
import sen3004.app5.model.Person;

@Repository
public class App5Repository {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	private RowMapper<Person> rowMapper = new RowMapper<Person>() {

		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person person = new Person();
			person.setId(rs.getLong("id"));
			person.setpName(rs.getString("pname"));
			person.setPrice(rs.getLong("price"));
			
			return person;
		}
		
	};

	@Autowired
	private JdbcTemplate jdbcTemplate2;

	private RowMapper<Order> rowMapper2 = new RowMapper<Order>(){
		public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
			Order order = new Order();
			order.setId(rs.getLong("id"));
			order.setFirstName(rs.getString("pname"));
			order.setPrice(rs.getLong("price"));
			order.setMasaNo(rs.getLong("masano"));

			return order;
	}
}; 
	
	public List<Person> findAll(){
		String sql = "select * from person";
		return jdbcTemplate.query(sql, rowMapper);
	}

	public Person findById(long id){
		String sql = "select * from person where id = ?";
		return DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper, id));
	}

	public void create(Person person) {
		String sql = "insert into person(pname, price) values(?, ?)";
		jdbcTemplate.update(sql, person.getpName(), person.getPrice());
	}

	public void delete(long id) {
		String sql = "delete from person where id = ?";
		jdbcTemplate.update(sql, id);
	} 

	public List<Order> findAll2(){
		String sql = "select * from personOrder";
		return jdbcTemplate2.query(sql, rowMapper2);
	}

	public Order findById2(long id){
		String sql = "select * from personOrder where id = ?";
		return DataAccessUtils.singleResult(jdbcTemplate.query(sql, rowMapper2, id));
	}

	public void create(Order order) {
		String sql= "insert into personOrder select * from person";
		jdbcTemplate2.update(sql);
		String sql2="UPDATE personOrder SET masano= ? WHERE masano is null";
		jdbcTemplate2.update(sql2, order.getMasaNo());
	}

	public void entertable(Order order){
		String sql2="UPDATE personOrder SET masano= ? WHERE masano='0'";
		jdbcTemplate2.update(sql2, order.getMasaNo());
	}

	public void delete2(long id) {
		String sql = "delete from personOrder where id = ?";
		jdbcTemplate2.update(sql, id);
	}

	public void deleteall(){
		String sql = "delete from person";
		jdbcTemplate2.update(sql);
	}

}
