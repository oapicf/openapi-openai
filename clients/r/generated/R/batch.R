#' Create a new Batch
#'
#' @description
#' Batch Class
#'
#' @docType class
#' @title Batch
#' @description Batch Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object The object type, which is always `batch`. character
#' @field endpoint The OpenAI API endpoint used by the batch. character
#' @field errors  \link{BatchErrors} [optional]
#' @field input_file_id The ID of the input file for the batch. character
#' @field completion_window The time frame within which the batch should be processed. character
#' @field status The current status of the batch. character
#' @field output_file_id The ID of the file containing the outputs of successfully executed requests. character [optional]
#' @field error_file_id The ID of the file containing the outputs of requests with errors. character [optional]
#' @field created_at The Unix timestamp (in seconds) for when the batch was created. integer
#' @field in_progress_at The Unix timestamp (in seconds) for when the batch started processing. integer [optional]
#' @field expires_at The Unix timestamp (in seconds) for when the batch will expire. integer [optional]
#' @field finalizing_at The Unix timestamp (in seconds) for when the batch started finalizing. integer [optional]
#' @field completed_at The Unix timestamp (in seconds) for when the batch was completed. integer [optional]
#' @field failed_at The Unix timestamp (in seconds) for when the batch failed. integer [optional]
#' @field expired_at The Unix timestamp (in seconds) for when the batch expired. integer [optional]
#' @field cancelling_at The Unix timestamp (in seconds) for when the batch started cancelling. integer [optional]
#' @field cancelled_at The Unix timestamp (in seconds) for when the batch was cancelled. integer [optional]
#' @field request_counts  \link{BatchRequestCounts} [optional]
#' @field metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. object [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Batch <- R6::R6Class(
  "Batch",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `endpoint` = NULL,
    `errors` = NULL,
    `input_file_id` = NULL,
    `completion_window` = NULL,
    `status` = NULL,
    `output_file_id` = NULL,
    `error_file_id` = NULL,
    `created_at` = NULL,
    `in_progress_at` = NULL,
    `expires_at` = NULL,
    `finalizing_at` = NULL,
    `completed_at` = NULL,
    `failed_at` = NULL,
    `expired_at` = NULL,
    `cancelling_at` = NULL,
    `cancelled_at` = NULL,
    `request_counts` = NULL,
    `metadata` = NULL,

    #' @description
    #' Initialize a new Batch class.
    #'
    #' @param id id
    #' @param object The object type, which is always `batch`.
    #' @param endpoint The OpenAI API endpoint used by the batch.
    #' @param input_file_id The ID of the input file for the batch.
    #' @param completion_window The time frame within which the batch should be processed.
    #' @param status The current status of the batch.
    #' @param created_at The Unix timestamp (in seconds) for when the batch was created.
    #' @param errors errors
    #' @param output_file_id The ID of the file containing the outputs of successfully executed requests.
    #' @param error_file_id The ID of the file containing the outputs of requests with errors.
    #' @param in_progress_at The Unix timestamp (in seconds) for when the batch started processing.
    #' @param expires_at The Unix timestamp (in seconds) for when the batch will expire.
    #' @param finalizing_at The Unix timestamp (in seconds) for when the batch started finalizing.
    #' @param completed_at The Unix timestamp (in seconds) for when the batch was completed.
    #' @param failed_at The Unix timestamp (in seconds) for when the batch failed.
    #' @param expired_at The Unix timestamp (in seconds) for when the batch expired.
    #' @param cancelling_at The Unix timestamp (in seconds) for when the batch started cancelling.
    #' @param cancelled_at The Unix timestamp (in seconds) for when the batch was cancelled.
    #' @param request_counts request_counts
    #' @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.
    #' @param ... Other optional arguments.
    initialize = function(`id`, `object`, `endpoint`, `input_file_id`, `completion_window`, `status`, `created_at`, `errors` = NULL, `output_file_id` = NULL, `error_file_id` = NULL, `in_progress_at` = NULL, `expires_at` = NULL, `finalizing_at` = NULL, `completed_at` = NULL, `failed_at` = NULL, `expired_at` = NULL, `cancelling_at` = NULL, `cancelled_at` = NULL, `request_counts` = NULL, `metadata` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("batch"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"batch\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`endpoint`)) {
        if (!(is.character(`endpoint`) && length(`endpoint`) == 1)) {
          stop(paste("Error! Invalid data for `endpoint`. Must be a string:", `endpoint`))
        }
        self$`endpoint` <- `endpoint`
      }
      if (!missing(`input_file_id`)) {
        if (!(is.character(`input_file_id`) && length(`input_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `input_file_id`. Must be a string:", `input_file_id`))
        }
        self$`input_file_id` <- `input_file_id`
      }
      if (!missing(`completion_window`)) {
        if (!(is.character(`completion_window`) && length(`completion_window`) == 1)) {
          stop(paste("Error! Invalid data for `completion_window`. Must be a string:", `completion_window`))
        }
        self$`completion_window` <- `completion_window`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("validating", "failed", "in_progress", "finalizing", "completed", "expired", "cancelling", "cancelled"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"validating\", \"failed\", \"in_progress\", \"finalizing\", \"completed\", \"expired\", \"cancelling\", \"cancelled\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!is.null(`errors`)) {
        stopifnot(R6::is.R6(`errors`))
        self$`errors` <- `errors`
      }
      if (!is.null(`output_file_id`)) {
        if (!(is.character(`output_file_id`) && length(`output_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `output_file_id`. Must be a string:", `output_file_id`))
        }
        self$`output_file_id` <- `output_file_id`
      }
      if (!is.null(`error_file_id`)) {
        if (!(is.character(`error_file_id`) && length(`error_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `error_file_id`. Must be a string:", `error_file_id`))
        }
        self$`error_file_id` <- `error_file_id`
      }
      if (!is.null(`in_progress_at`)) {
        if (!(is.numeric(`in_progress_at`) && length(`in_progress_at`) == 1)) {
          stop(paste("Error! Invalid data for `in_progress_at`. Must be an integer:", `in_progress_at`))
        }
        self$`in_progress_at` <- `in_progress_at`
      }
      if (!is.null(`expires_at`)) {
        if (!(is.numeric(`expires_at`) && length(`expires_at`) == 1)) {
          stop(paste("Error! Invalid data for `expires_at`. Must be an integer:", `expires_at`))
        }
        self$`expires_at` <- `expires_at`
      }
      if (!is.null(`finalizing_at`)) {
        if (!(is.numeric(`finalizing_at`) && length(`finalizing_at`) == 1)) {
          stop(paste("Error! Invalid data for `finalizing_at`. Must be an integer:", `finalizing_at`))
        }
        self$`finalizing_at` <- `finalizing_at`
      }
      if (!is.null(`completed_at`)) {
        if (!(is.numeric(`completed_at`) && length(`completed_at`) == 1)) {
          stop(paste("Error! Invalid data for `completed_at`. Must be an integer:", `completed_at`))
        }
        self$`completed_at` <- `completed_at`
      }
      if (!is.null(`failed_at`)) {
        if (!(is.numeric(`failed_at`) && length(`failed_at`) == 1)) {
          stop(paste("Error! Invalid data for `failed_at`. Must be an integer:", `failed_at`))
        }
        self$`failed_at` <- `failed_at`
      }
      if (!is.null(`expired_at`)) {
        if (!(is.numeric(`expired_at`) && length(`expired_at`) == 1)) {
          stop(paste("Error! Invalid data for `expired_at`. Must be an integer:", `expired_at`))
        }
        self$`expired_at` <- `expired_at`
      }
      if (!is.null(`cancelling_at`)) {
        if (!(is.numeric(`cancelling_at`) && length(`cancelling_at`) == 1)) {
          stop(paste("Error! Invalid data for `cancelling_at`. Must be an integer:", `cancelling_at`))
        }
        self$`cancelling_at` <- `cancelling_at`
      }
      if (!is.null(`cancelled_at`)) {
        if (!(is.numeric(`cancelled_at`) && length(`cancelled_at`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled_at`. Must be an integer:", `cancelled_at`))
        }
        self$`cancelled_at` <- `cancelled_at`
      }
      if (!is.null(`request_counts`)) {
        stopifnot(R6::is.R6(`request_counts`))
        self$`request_counts` <- `request_counts`
      }
      if (!is.null(`metadata`)) {
        self$`metadata` <- `metadata`
      }
    },

    #' @description
    #' Convert to an R object. This method is deprecated. Use `toSimpleType()` instead.
    toJSON = function() {
      .Deprecated(new = "toSimpleType", msg = "Use the '$toSimpleType()' method instead since that is more clearly named. Use '$toJSONString()' to get a JSON string")
      return(self$toSimpleType())
    },

    #' @description
    #' Convert to a List
    #'
    #' Convert the R6 object to a list to work more easily with other tooling.
    #'
    #' @return Batch as a base R list.
    #' @examples
    #' # convert array of Batch (x) to a data frame
    #' \dontrun{
    #' library(purrr)
    #' library(tibble)
    #' df <- x |> map(\(y)y$toList()) |> map(as_tibble) |> list_rbind()
    #' df
    #' }
    toList = function() {
      return(self$toSimpleType())
    },

    #' @description
    #' Convert Batch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchObject <- list()
      if (!is.null(self$`id`)) {
        BatchObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        BatchObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`endpoint`)) {
        BatchObject[["endpoint"]] <-
          self$`endpoint`
      }
      if (!is.null(self$`errors`)) {
        BatchObject[["errors"]] <-
          self$`errors`$toSimpleType()
      }
      if (!is.null(self$`input_file_id`)) {
        BatchObject[["input_file_id"]] <-
          self$`input_file_id`
      }
      if (!is.null(self$`completion_window`)) {
        BatchObject[["completion_window"]] <-
          self$`completion_window`
      }
      if (!is.null(self$`status`)) {
        BatchObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`output_file_id`)) {
        BatchObject[["output_file_id"]] <-
          self$`output_file_id`
      }
      if (!is.null(self$`error_file_id`)) {
        BatchObject[["error_file_id"]] <-
          self$`error_file_id`
      }
      if (!is.null(self$`created_at`)) {
        BatchObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`in_progress_at`)) {
        BatchObject[["in_progress_at"]] <-
          self$`in_progress_at`
      }
      if (!is.null(self$`expires_at`)) {
        BatchObject[["expires_at"]] <-
          self$`expires_at`
      }
      if (!is.null(self$`finalizing_at`)) {
        BatchObject[["finalizing_at"]] <-
          self$`finalizing_at`
      }
      if (!is.null(self$`completed_at`)) {
        BatchObject[["completed_at"]] <-
          self$`completed_at`
      }
      if (!is.null(self$`failed_at`)) {
        BatchObject[["failed_at"]] <-
          self$`failed_at`
      }
      if (!is.null(self$`expired_at`)) {
        BatchObject[["expired_at"]] <-
          self$`expired_at`
      }
      if (!is.null(self$`cancelling_at`)) {
        BatchObject[["cancelling_at"]] <-
          self$`cancelling_at`
      }
      if (!is.null(self$`cancelled_at`)) {
        BatchObject[["cancelled_at"]] <-
          self$`cancelled_at`
      }
      if (!is.null(self$`request_counts`)) {
        BatchObject[["request_counts"]] <-
          self$`request_counts`$toSimpleType()
      }
      if (!is.null(self$`metadata`)) {
        BatchObject[["metadata"]] <-
          self$`metadata`
      }
      return(BatchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of Batch
    #'
    #' @param input_json the JSON input
    #' @return the instance of Batch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("batch"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"batch\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`endpoint`)) {
        self$`endpoint` <- this_object$`endpoint`
      }
      if (!is.null(this_object$`errors`)) {
        `errors_object` <- BatchErrors$new()
        `errors_object`$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
        self$`errors` <- `errors_object`
      }
      if (!is.null(this_object$`input_file_id`)) {
        self$`input_file_id` <- this_object$`input_file_id`
      }
      if (!is.null(this_object$`completion_window`)) {
        self$`completion_window` <- this_object$`completion_window`
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("validating", "failed", "in_progress", "finalizing", "completed", "expired", "cancelling", "cancelled"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"validating\", \"failed\", \"in_progress\", \"finalizing\", \"completed\", \"expired\", \"cancelling\", \"cancelled\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`output_file_id`)) {
        self$`output_file_id` <- this_object$`output_file_id`
      }
      if (!is.null(this_object$`error_file_id`)) {
        self$`error_file_id` <- this_object$`error_file_id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`in_progress_at`)) {
        self$`in_progress_at` <- this_object$`in_progress_at`
      }
      if (!is.null(this_object$`expires_at`)) {
        self$`expires_at` <- this_object$`expires_at`
      }
      if (!is.null(this_object$`finalizing_at`)) {
        self$`finalizing_at` <- this_object$`finalizing_at`
      }
      if (!is.null(this_object$`completed_at`)) {
        self$`completed_at` <- this_object$`completed_at`
      }
      if (!is.null(this_object$`failed_at`)) {
        self$`failed_at` <- this_object$`failed_at`
      }
      if (!is.null(this_object$`expired_at`)) {
        self$`expired_at` <- this_object$`expired_at`
      }
      if (!is.null(this_object$`cancelling_at`)) {
        self$`cancelling_at` <- this_object$`cancelling_at`
      }
      if (!is.null(this_object$`cancelled_at`)) {
        self$`cancelled_at` <- this_object$`cancelled_at`
      }
      if (!is.null(this_object$`request_counts`)) {
        `request_counts_object` <- BatchRequestCounts$new()
        `request_counts_object`$fromJSON(jsonlite::toJSON(this_object$`request_counts`, auto_unbox = TRUE, digits = NA))
        self$`request_counts` <- `request_counts_object`
      }
      if (!is.null(this_object$`metadata`)) {
        self$`metadata` <- this_object$`metadata`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return Batch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of Batch
    #'
    #' @param input_json the JSON input
    #' @return the instance of Batch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("batch"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"batch\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`endpoint` <- this_object$`endpoint`
      self$`errors` <- BatchErrors$new()$fromJSON(jsonlite::toJSON(this_object$`errors`, auto_unbox = TRUE, digits = NA))
      self$`input_file_id` <- this_object$`input_file_id`
      self$`completion_window` <- this_object$`completion_window`
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("validating", "failed", "in_progress", "finalizing", "completed", "expired", "cancelling", "cancelled"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"validating\", \"failed\", \"in_progress\", \"finalizing\", \"completed\", \"expired\", \"cancelling\", \"cancelled\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`output_file_id` <- this_object$`output_file_id`
      self$`error_file_id` <- this_object$`error_file_id`
      self$`created_at` <- this_object$`created_at`
      self$`in_progress_at` <- this_object$`in_progress_at`
      self$`expires_at` <- this_object$`expires_at`
      self$`finalizing_at` <- this_object$`finalizing_at`
      self$`completed_at` <- this_object$`completed_at`
      self$`failed_at` <- this_object$`failed_at`
      self$`expired_at` <- this_object$`expired_at`
      self$`cancelling_at` <- this_object$`cancelling_at`
      self$`cancelled_at` <- this_object$`cancelled_at`
      self$`request_counts` <- BatchRequestCounts$new()$fromJSON(jsonlite::toJSON(this_object$`request_counts`, auto_unbox = TRUE, digits = NA))
      self$`metadata` <- this_object$`metadata`
      self
    },

    #' @description
    #' Validate JSON input with respect to Batch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `object` is missing."))
      }
      # check the required field `endpoint`
      if (!is.null(input_json$`endpoint`)) {
        if (!(is.character(input_json$`endpoint`) && length(input_json$`endpoint`) == 1)) {
          stop(paste("Error! Invalid data for `endpoint`. Must be a string:", input_json$`endpoint`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `endpoint` is missing."))
      }
      # check the required field `input_file_id`
      if (!is.null(input_json$`input_file_id`)) {
        if (!(is.character(input_json$`input_file_id`) && length(input_json$`input_file_id`) == 1)) {
          stop(paste("Error! Invalid data for `input_file_id`. Must be a string:", input_json$`input_file_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `input_file_id` is missing."))
      }
      # check the required field `completion_window`
      if (!is.null(input_json$`completion_window`)) {
        if (!(is.character(input_json$`completion_window`) && length(input_json$`completion_window`) == 1)) {
          stop(paste("Error! Invalid data for `completion_window`. Must be a string:", input_json$`completion_window`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `completion_window` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `status` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for Batch: the required field `created_at` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of Batch
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `endpoint` is null
      if (is.null(self$`endpoint`)) {
        return(FALSE)
      }

      # check if the required `input_file_id` is null
      if (is.null(self$`input_file_id`)) {
        return(FALSE)
      }

      # check if the required `completion_window` is null
      if (is.null(self$`completion_window`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `endpoint` is null
      if (is.null(self$`endpoint`)) {
        invalid_fields["endpoint"] <- "Non-nullable required field `endpoint` cannot be null."
      }

      # check if the required `input_file_id` is null
      if (is.null(self$`input_file_id`)) {
        invalid_fields["input_file_id"] <- "Non-nullable required field `input_file_id` cannot be null."
      }

      # check if the required `completion_window` is null
      if (is.null(self$`completion_window`)) {
        invalid_fields["completion_window"] <- "Non-nullable required field `completion_window` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# Batch$unlock()
#
## Below is an example to define the print function
# Batch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Batch$lock()

