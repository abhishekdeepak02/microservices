package com.lazycoder.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema to hold standard response information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code of the Response",
            example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status Message of the Response",
            example = "Request processed successfully"
    )
    private String statusMsg;
}
