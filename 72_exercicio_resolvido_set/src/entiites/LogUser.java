package entiites;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogUser {

	private String user;
	private LocalDateTime moment;

	public LogUser(String user, LocalDateTime moment) {
		this.user = user;
		this.moment = moment;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		return Objects.hash(user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogUser other = (LogUser) obj;
		return Objects.equals(user, other.user);
	}

}
