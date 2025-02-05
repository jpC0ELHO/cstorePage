package cstore.registrousers.dominio.entities;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "tb_usuariocnpj")
@EntityListeners(AuditingEntityListener.class)
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UsuarioCnpj extends Entidade{
}
