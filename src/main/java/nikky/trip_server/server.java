package nikky.trip_server;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class server {
		@GetMapping("/get_flights")
		public String get_flights ( @RequestParam String start_point , @RequestParam String destination_point , @RequestParam String date ) throws SQLException {
			return date+"\n"+destination_point+"\n"+start_point;
		}
		
	}
