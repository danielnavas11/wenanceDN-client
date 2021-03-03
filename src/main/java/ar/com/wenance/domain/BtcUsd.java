package ar.com.wenance.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BtcUsd implements Serializable {

    private Long id;

    private BigDecimal lprice;

    private String curr1;

    private String curr2;

    private LocalDateTime localDateTime;
}