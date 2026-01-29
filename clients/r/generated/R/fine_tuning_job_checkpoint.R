#' Create a new FineTuningJobCheckpoint
#'
#' @description
#' The `fine_tuning.job.checkpoint` object represents a model checkpoint for a fine-tuning job that is ready to use. 
#'
#' @docType class
#' @title FineTuningJobCheckpoint
#' @description FineTuningJobCheckpoint Class
#' @format An \code{R6Class} generator object
#' @field id The checkpoint identifier, which can be referenced in the API endpoints. character
#' @field created_at The Unix timestamp (in seconds) for when the checkpoint was created. integer
#' @field fine_tuned_model_checkpoint The name of the fine-tuned checkpoint model that is created. character
#' @field step_number The step number that the checkpoint was created at. integer
#' @field metrics  \link{FineTuningJobCheckpointMetrics}
#' @field fine_tuning_job_id The name of the fine-tuning job that this checkpoint was created from. character
#' @field object The object type, which is always \"fine_tuning.job.checkpoint\". character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJobCheckpoint <- R6::R6Class(
  "FineTuningJobCheckpoint",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `fine_tuned_model_checkpoint` = NULL,
    `step_number` = NULL,
    `metrics` = NULL,
    `fine_tuning_job_id` = NULL,
    `object` = NULL,

    #' @description
    #' Initialize a new FineTuningJobCheckpoint class.
    #'
    #' @param id The checkpoint identifier, which can be referenced in the API endpoints.
    #' @param created_at The Unix timestamp (in seconds) for when the checkpoint was created.
    #' @param fine_tuned_model_checkpoint The name of the fine-tuned checkpoint model that is created.
    #' @param step_number The step number that the checkpoint was created at.
    #' @param metrics metrics
    #' @param fine_tuning_job_id The name of the fine-tuning job that this checkpoint was created from.
    #' @param object The object type, which is always \"fine_tuning.job.checkpoint\".
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created_at`, `fine_tuned_model_checkpoint`, `step_number`, `metrics`, `fine_tuning_job_id`, `object`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`fine_tuned_model_checkpoint`)) {
        if (!(is.character(`fine_tuned_model_checkpoint`) && length(`fine_tuned_model_checkpoint`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model_checkpoint`. Must be a string:", `fine_tuned_model_checkpoint`))
        }
        self$`fine_tuned_model_checkpoint` <- `fine_tuned_model_checkpoint`
      }
      if (!missing(`step_number`)) {
        if (!(is.numeric(`step_number`) && length(`step_number`) == 1)) {
          stop(paste("Error! Invalid data for `step_number`. Must be an integer:", `step_number`))
        }
        self$`step_number` <- `step_number`
      }
      if (!missing(`metrics`)) {
        stopifnot(R6::is.R6(`metrics`))
        self$`metrics` <- `metrics`
      }
      if (!missing(`fine_tuning_job_id`)) {
        if (!(is.character(`fine_tuning_job_id`) && length(`fine_tuning_job_id`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuning_job_id`. Must be a string:", `fine_tuning_job_id`))
        }
        self$`fine_tuning_job_id` <- `fine_tuning_job_id`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("fine_tuning.job.checkpoint"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.checkpoint\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
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
    #' @return FineTuningJobCheckpoint as a base R list.
    #' @examples
    #' # convert array of FineTuningJobCheckpoint (x) to a data frame
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
    #' Convert FineTuningJobCheckpoint to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuningJobCheckpointObject <- list()
      if (!is.null(self$`id`)) {
        FineTuningJobCheckpointObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        FineTuningJobCheckpointObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`fine_tuned_model_checkpoint`)) {
        FineTuningJobCheckpointObject[["fine_tuned_model_checkpoint"]] <-
          self$`fine_tuned_model_checkpoint`
      }
      if (!is.null(self$`step_number`)) {
        FineTuningJobCheckpointObject[["step_number"]] <-
          self$`step_number`
      }
      if (!is.null(self$`metrics`)) {
        FineTuningJobCheckpointObject[["metrics"]] <-
          self$`metrics`$toSimpleType()
      }
      if (!is.null(self$`fine_tuning_job_id`)) {
        FineTuningJobCheckpointObject[["fine_tuning_job_id"]] <-
          self$`fine_tuning_job_id`
      }
      if (!is.null(self$`object`)) {
        FineTuningJobCheckpointObject[["object"]] <-
          self$`object`
      }
      return(FineTuningJobCheckpointObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobCheckpoint
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobCheckpoint
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`fine_tuned_model_checkpoint`)) {
        self$`fine_tuned_model_checkpoint` <- this_object$`fine_tuned_model_checkpoint`
      }
      if (!is.null(this_object$`step_number`)) {
        self$`step_number` <- this_object$`step_number`
      }
      if (!is.null(this_object$`metrics`)) {
        `metrics_object` <- FineTuningJobCheckpointMetrics$new()
        `metrics_object`$fromJSON(jsonlite::toJSON(this_object$`metrics`, auto_unbox = TRUE, digits = NA))
        self$`metrics` <- `metrics_object`
      }
      if (!is.null(this_object$`fine_tuning_job_id`)) {
        self$`fine_tuning_job_id` <- this_object$`fine_tuning_job_id`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job.checkpoint"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.checkpoint\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuningJobCheckpoint in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJobCheckpoint
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJobCheckpoint
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`fine_tuned_model_checkpoint` <- this_object$`fine_tuned_model_checkpoint`
      self$`step_number` <- this_object$`step_number`
      self$`metrics` <- FineTuningJobCheckpointMetrics$new()$fromJSON(jsonlite::toJSON(this_object$`metrics`, auto_unbox = TRUE, digits = NA))
      self$`fine_tuning_job_id` <- this_object$`fine_tuning_job_id`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job.checkpoint"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job.checkpoint\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJobCheckpoint and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `created_at` is missing."))
      }
      # check the required field `fine_tuned_model_checkpoint`
      if (!is.null(input_json$`fine_tuned_model_checkpoint`)) {
        if (!(is.character(input_json$`fine_tuned_model_checkpoint`) && length(input_json$`fine_tuned_model_checkpoint`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model_checkpoint`. Must be a string:", input_json$`fine_tuned_model_checkpoint`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `fine_tuned_model_checkpoint` is missing."))
      }
      # check the required field `step_number`
      if (!is.null(input_json$`step_number`)) {
        if (!(is.numeric(input_json$`step_number`) && length(input_json$`step_number`) == 1)) {
          stop(paste("Error! Invalid data for `step_number`. Must be an integer:", input_json$`step_number`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `step_number` is missing."))
      }
      # check the required field `metrics`
      if (!is.null(input_json$`metrics`)) {
        stopifnot(R6::is.R6(input_json$`metrics`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `metrics` is missing."))
      }
      # check the required field `fine_tuning_job_id`
      if (!is.null(input_json$`fine_tuning_job_id`)) {
        if (!(is.character(input_json$`fine_tuning_job_id`) && length(input_json$`fine_tuning_job_id`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuning_job_id`. Must be a string:", input_json$`fine_tuning_job_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `fine_tuning_job_id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJobCheckpoint: the required field `object` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJobCheckpoint
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `fine_tuned_model_checkpoint` is null
      if (is.null(self$`fine_tuned_model_checkpoint`)) {
        return(FALSE)
      }

      # check if the required `step_number` is null
      if (is.null(self$`step_number`)) {
        return(FALSE)
      }

      # check if the required `metrics` is null
      if (is.null(self$`metrics`)) {
        return(FALSE)
      }

      # check if the required `fine_tuning_job_id` is null
      if (is.null(self$`fine_tuning_job_id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
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

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `fine_tuned_model_checkpoint` is null
      if (is.null(self$`fine_tuned_model_checkpoint`)) {
        invalid_fields["fine_tuned_model_checkpoint"] <- "Non-nullable required field `fine_tuned_model_checkpoint` cannot be null."
      }

      # check if the required `step_number` is null
      if (is.null(self$`step_number`)) {
        invalid_fields["step_number"] <- "Non-nullable required field `step_number` cannot be null."
      }

      # check if the required `metrics` is null
      if (is.null(self$`metrics`)) {
        invalid_fields["metrics"] <- "Non-nullable required field `metrics` cannot be null."
      }

      # check if the required `fine_tuning_job_id` is null
      if (is.null(self$`fine_tuning_job_id`)) {
        invalid_fields["fine_tuning_job_id"] <- "Non-nullable required field `fine_tuning_job_id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
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
# FineTuningJobCheckpoint$unlock()
#
## Below is an example to define the print function
# FineTuningJobCheckpoint$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJobCheckpoint$lock()

