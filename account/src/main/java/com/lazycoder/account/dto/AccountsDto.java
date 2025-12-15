package com.lazycoder.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
@Data
public class AccountsDto {

    @Schema(
            description = "Account Number of the Customer",
            example = "123456789012"
    )
    @NotEmpty(message = "Account number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Account number must be 12 digits")
    private Long accountNumber;

    @Schema(
            description = "Account Type",
            example = "Saving"
    )
    @NotEmpty(message = "Account type cannot be null or empty")
    private String accountType;

    @Schema(
            description = "Address of the Branch",
            example = "123, Main Street, Cityville"
    )
    @NotEmpty(message = "Branch address cannot be null or empty")
    private String branchAddress;
}
