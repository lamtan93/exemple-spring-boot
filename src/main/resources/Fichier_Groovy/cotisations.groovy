import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@RestController
class CotisationsController {
@Autowired JdbcTemplate jdbcTemplate;
RowMapper<Cotisation> rowMapper = {rs,num -> return new Cotisation(
id:rs.getInt("ID"),
libelle:rs.getString("LIBELLE"),
code:rs.getString("CODE"),
tauxSalarial:rs.getString("TAUXSALARIAL"),
tauxPatronal:rs.getString("TAUXPATRONAL")
)}
	@RequestMapping("/")
	List<Cotisation> lister() {
	return this.jdbcTemplate.query("select * from COTISATION", rowMapper)
	}
}