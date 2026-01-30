#' Create a new FineTuningJob
#'
#' @description
#' The `fine_tuning.job` object represents a fine-tuning job that has been created through the API. 
#'
#' @docType class
#' @title FineTuningJob
#' @description FineTuningJob Class
#' @format An \code{R6Class} generator object
#' @field id The object identifier, which can be referenced in the API endpoints. character
#' @field created_at The Unix timestamp (in seconds) for when the fine-tuning job was created. integer
#' @field error  \link{FineTuningJobError}
#' @field fine_tuned_model The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. character
#' @field finished_at The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. integer
#' @field hyperparameters  \link{FineTuningJobHyperparameters}
#' @field model The base model that is being fine-tuned. character
#' @field object The object type, which is always \"fine_tuning.job\". character
#' @field organization_id The organization that owns the fine-tuning job. character
#' @field result_files The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). list(character)
#' @field status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. character
#' @field trained_tokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. integer
#' @field training_file The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). character
#' @field validation_file The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). character
#' @field integrations A list of integrations to enable for this fine-tuning job. list(\link{FineTuningJobIntegrationsInner}) [optional]
#' @field seed The seed used for the fine-tuning job. integer
#' @field estimated_finish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running. integer [optional]
#' @field method  \link{FineTuneMethod} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTuningJob <- R6::R6Class(
  "FineTuningJob",
  public = list(
    `id` = NULL,
    `created_at` = NULL,
    `error` = NULL,
    `fine_tuned_model` = NULL,
    `finished_at` = NULL,
    `hyperparameters` = NULL,
    `model` = NULL,
    `object` = NULL,
    `organization_id` = NULL,
    `result_files` = NULL,
    `status` = NULL,
    `trained_tokens` = NULL,
    `training_file` = NULL,
    `validation_file` = NULL,
    `integrations` = NULL,
    `seed` = NULL,
    `estimated_finish` = NULL,
    `method` = NULL,

    #' @description
    #' Initialize a new FineTuningJob class.
    #'
    #' @param id The object identifier, which can be referenced in the API endpoints.
    #' @param created_at The Unix timestamp (in seconds) for when the fine-tuning job was created.
    #' @param error error
    #' @param fine_tuned_model The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
    #' @param finished_at The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
    #' @param hyperparameters hyperparameters
    #' @param model The base model that is being fine-tuned.
    #' @param object The object type, which is always \"fine_tuning.job\".
    #' @param organization_id The organization that owns the fine-tuning job.
    #' @param result_files The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
    #' @param status The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    #' @param trained_tokens The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
    #' @param training_file The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
    #' @param validation_file The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
    #' @param seed The seed used for the fine-tuning job.
    #' @param integrations A list of integrations to enable for this fine-tuning job.
    #' @param estimated_finish The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
    #' @param method method
    #' @param ... Other optional arguments.
    initialize = function(`id`, `created_at`, `error`, `fine_tuned_model`, `finished_at`, `hyperparameters`, `model`, `object`, `organization_id`, `result_files`, `status`, `trained_tokens`, `training_file`, `validation_file`, `seed`, `integrations` = NULL, `estimated_finish` = NULL, `method` = NULL, ...) {
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
      if (!missing(`error`)) {
        stopifnot(R6::is.R6(`error`))
        self$`error` <- `error`
      }
      if (!missing(`fine_tuned_model`)) {
        if (!(is.character(`fine_tuned_model`) && length(`fine_tuned_model`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model`. Must be a string:", `fine_tuned_model`))
        }
        self$`fine_tuned_model` <- `fine_tuned_model`
      }
      if (!missing(`finished_at`)) {
        if (!(is.numeric(`finished_at`) && length(`finished_at`) == 1)) {
          stop(paste("Error! Invalid data for `finished_at`. Must be an integer:", `finished_at`))
        }
        self$`finished_at` <- `finished_at`
      }
      if (!missing(`hyperparameters`)) {
        stopifnot(R6::is.R6(`hyperparameters`))
        self$`hyperparameters` <- `hyperparameters`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`object`)) {
        if (!(`object` %in% c("fine_tuning.job"))) {
          stop(paste("Error! \"", `object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job\".", sep = ""))
        }
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`organization_id`)) {
        if (!(is.character(`organization_id`) && length(`organization_id`) == 1)) {
          stop(paste("Error! Invalid data for `organization_id`. Must be a string:", `organization_id`))
        }
        self$`organization_id` <- `organization_id`
      }
      if (!missing(`result_files`)) {
        stopifnot(is.vector(`result_files`), length(`result_files`) != 0)
        sapply(`result_files`, function(x) stopifnot(is.character(x)))
        self$`result_files` <- `result_files`
      }
      if (!missing(`status`)) {
        if (!(`status` %in% c("validating_files", "queued", "running", "succeeded", "failed", "cancelled"))) {
          stop(paste("Error! \"", `status`, "\" cannot be assigned to `status`. Must be \"validating_files\", \"queued\", \"running\", \"succeeded\", \"failed\", \"cancelled\".", sep = ""))
        }
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`trained_tokens`)) {
        if (!(is.numeric(`trained_tokens`) && length(`trained_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `trained_tokens`. Must be an integer:", `trained_tokens`))
        }
        self$`trained_tokens` <- `trained_tokens`
      }
      if (!missing(`training_file`)) {
        if (!(is.character(`training_file`) && length(`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", `training_file`))
        }
        self$`training_file` <- `training_file`
      }
      if (!missing(`validation_file`)) {
        if (!(is.character(`validation_file`) && length(`validation_file`) == 1)) {
          stop(paste("Error! Invalid data for `validation_file`. Must be a string:", `validation_file`))
        }
        self$`validation_file` <- `validation_file`
      }
      if (!missing(`seed`)) {
        if (!(is.numeric(`seed`) && length(`seed`) == 1)) {
          stop(paste("Error! Invalid data for `seed`. Must be an integer:", `seed`))
        }
        self$`seed` <- `seed`
      }
      if (!is.null(`integrations`)) {
        stopifnot(is.vector(`integrations`), length(`integrations`) != 0)
        sapply(`integrations`, function(x) stopifnot(R6::is.R6(x)))
        self$`integrations` <- `integrations`
      }
      if (!is.null(`estimated_finish`)) {
        if (!(is.numeric(`estimated_finish`) && length(`estimated_finish`) == 1)) {
          stop(paste("Error! Invalid data for `estimated_finish`. Must be an integer:", `estimated_finish`))
        }
        self$`estimated_finish` <- `estimated_finish`
      }
      if (!is.null(`method`)) {
        stopifnot(R6::is.R6(`method`))
        self$`method` <- `method`
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
    #' @return FineTuningJob as a base R list.
    #' @examples
    #' # convert array of FineTuningJob (x) to a data frame
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
    #' Convert FineTuningJob to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      FineTuningJobObject <- list()
      if (!is.null(self$`id`)) {
        FineTuningJobObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`created_at`)) {
        FineTuningJobObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`error`)) {
        FineTuningJobObject[["error"]] <-
          self$`error`$toSimpleType()
      }
      if (!is.null(self$`fine_tuned_model`)) {
        FineTuningJobObject[["fine_tuned_model"]] <-
          self$`fine_tuned_model`
      }
      if (!is.null(self$`finished_at`)) {
        FineTuningJobObject[["finished_at"]] <-
          self$`finished_at`
      }
      if (!is.null(self$`hyperparameters`)) {
        FineTuningJobObject[["hyperparameters"]] <-
          self$`hyperparameters`$toSimpleType()
      }
      if (!is.null(self$`model`)) {
        FineTuningJobObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`object`)) {
        FineTuningJobObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`organization_id`)) {
        FineTuningJobObject[["organization_id"]] <-
          self$`organization_id`
      }
      if (!is.null(self$`result_files`)) {
        FineTuningJobObject[["result_files"]] <-
          self$`result_files`
      }
      if (!is.null(self$`status`)) {
        FineTuningJobObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`trained_tokens`)) {
        FineTuningJobObject[["trained_tokens"]] <-
          self$`trained_tokens`
      }
      if (!is.null(self$`training_file`)) {
        FineTuningJobObject[["training_file"]] <-
          self$`training_file`
      }
      if (!is.null(self$`validation_file`)) {
        FineTuningJobObject[["validation_file"]] <-
          self$`validation_file`
      }
      if (!is.null(self$`integrations`)) {
        FineTuningJobObject[["integrations"]] <-
          lapply(self$`integrations`, function(x) x$toSimpleType())
      }
      if (!is.null(self$`seed`)) {
        FineTuningJobObject[["seed"]] <-
          self$`seed`
      }
      if (!is.null(self$`estimated_finish`)) {
        FineTuningJobObject[["estimated_finish"]] <-
          self$`estimated_finish`
      }
      if (!is.null(self$`method`)) {
        FineTuningJobObject[["method"]] <-
          self$`method`$toSimpleType()
      }
      return(FineTuningJobObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJob
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJob
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`error`)) {
        `error_object` <- FineTuningJobError$new()
        `error_object`$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
        self$`error` <- `error_object`
      }
      if (!is.null(this_object$`fine_tuned_model`)) {
        self$`fine_tuned_model` <- this_object$`fine_tuned_model`
      }
      if (!is.null(this_object$`finished_at`)) {
        self$`finished_at` <- this_object$`finished_at`
      }
      if (!is.null(this_object$`hyperparameters`)) {
        `hyperparameters_object` <- FineTuningJobHyperparameters$new()
        `hyperparameters_object`$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
        self$`hyperparameters` <- `hyperparameters_object`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`object`)) {
        if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job"))) {
          stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job\".", sep = ""))
        }
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`organization_id`)) {
        self$`organization_id` <- this_object$`organization_id`
      }
      if (!is.null(this_object$`result_files`)) {
        self$`result_files` <- ApiClient$new()$deserializeObj(this_object$`result_files`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`status`)) {
        if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("validating_files", "queued", "running", "succeeded", "failed", "cancelled"))) {
          stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"validating_files\", \"queued\", \"running\", \"succeeded\", \"failed\", \"cancelled\".", sep = ""))
        }
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`trained_tokens`)) {
        self$`trained_tokens` <- this_object$`trained_tokens`
      }
      if (!is.null(this_object$`training_file`)) {
        self$`training_file` <- this_object$`training_file`
      }
      if (!is.null(this_object$`validation_file`)) {
        self$`validation_file` <- this_object$`validation_file`
      }
      if (!is.null(this_object$`integrations`)) {
        self$`integrations` <- ApiClient$new()$deserializeObj(this_object$`integrations`, "array[FineTuningJobIntegrationsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`seed`)) {
        self$`seed` <- this_object$`seed`
      }
      if (!is.null(this_object$`estimated_finish`)) {
        self$`estimated_finish` <- this_object$`estimated_finish`
      }
      if (!is.null(this_object$`method`)) {
        `method_object` <- FineTuneMethod$new()
        `method_object`$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
        self$`method` <- `method_object`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return FineTuningJob in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of FineTuningJob
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTuningJob
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`created_at` <- this_object$`created_at`
      self$`error` <- FineTuningJobError$new()$fromJSON(jsonlite::toJSON(this_object$`error`, auto_unbox = TRUE, digits = NA))
      self$`fine_tuned_model` <- this_object$`fine_tuned_model`
      self$`finished_at` <- this_object$`finished_at`
      self$`hyperparameters` <- FineTuningJobHyperparameters$new()$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
      self$`model` <- this_object$`model`
      if (!is.null(this_object$`object`) && !(this_object$`object` %in% c("fine_tuning.job"))) {
        stop(paste("Error! \"", this_object$`object`, "\" cannot be assigned to `object`. Must be \"fine_tuning.job\".", sep = ""))
      }
      self$`object` <- this_object$`object`
      self$`organization_id` <- this_object$`organization_id`
      self$`result_files` <- ApiClient$new()$deserializeObj(this_object$`result_files`, "array[character]", loadNamespace("openapi"))
      if (!is.null(this_object$`status`) && !(this_object$`status` %in% c("validating_files", "queued", "running", "succeeded", "failed", "cancelled"))) {
        stop(paste("Error! \"", this_object$`status`, "\" cannot be assigned to `status`. Must be \"validating_files\", \"queued\", \"running\", \"succeeded\", \"failed\", \"cancelled\".", sep = ""))
      }
      self$`status` <- this_object$`status`
      self$`trained_tokens` <- this_object$`trained_tokens`
      self$`training_file` <- this_object$`training_file`
      self$`validation_file` <- this_object$`validation_file`
      self$`integrations` <- ApiClient$new()$deserializeObj(this_object$`integrations`, "array[FineTuningJobIntegrationsInner]", loadNamespace("openapi"))
      self$`seed` <- this_object$`seed`
      self$`estimated_finish` <- this_object$`estimated_finish`
      self$`method` <- FineTuneMethod$new()$fromJSON(jsonlite::toJSON(this_object$`method`, auto_unbox = TRUE, digits = NA))
      self
    },

    #' @description
    #' Validate JSON input with respect to FineTuningJob and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `id` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `created_at` is missing."))
      }
      # check the required field `error`
      if (!is.null(input_json$`error`)) {
        stopifnot(R6::is.R6(input_json$`error`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `error` is missing."))
      }
      # check the required field `fine_tuned_model`
      if (!is.null(input_json$`fine_tuned_model`)) {
        if (!(is.character(input_json$`fine_tuned_model`) && length(input_json$`fine_tuned_model`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model`. Must be a string:", input_json$`fine_tuned_model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `fine_tuned_model` is missing."))
      }
      # check the required field `finished_at`
      if (!is.null(input_json$`finished_at`)) {
        if (!(is.numeric(input_json$`finished_at`) && length(input_json$`finished_at`) == 1)) {
          stop(paste("Error! Invalid data for `finished_at`. Must be an integer:", input_json$`finished_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `finished_at` is missing."))
      }
      # check the required field `hyperparameters`
      if (!is.null(input_json$`hyperparameters`)) {
        stopifnot(R6::is.R6(input_json$`hyperparameters`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `hyperparameters` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `model` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `object` is missing."))
      }
      # check the required field `organization_id`
      if (!is.null(input_json$`organization_id`)) {
        if (!(is.character(input_json$`organization_id`) && length(input_json$`organization_id`) == 1)) {
          stop(paste("Error! Invalid data for `organization_id`. Must be a string:", input_json$`organization_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `organization_id` is missing."))
      }
      # check the required field `result_files`
      if (!is.null(input_json$`result_files`)) {
        stopifnot(is.vector(input_json$`result_files`), length(input_json$`result_files`) != 0)
        tmp <- sapply(input_json$`result_files`, function(x) stopifnot(is.character(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `result_files` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `status` is missing."))
      }
      # check the required field `trained_tokens`
      if (!is.null(input_json$`trained_tokens`)) {
        if (!(is.numeric(input_json$`trained_tokens`) && length(input_json$`trained_tokens`) == 1)) {
          stop(paste("Error! Invalid data for `trained_tokens`. Must be an integer:", input_json$`trained_tokens`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `trained_tokens` is missing."))
      }
      # check the required field `training_file`
      if (!is.null(input_json$`training_file`)) {
        if (!(is.character(input_json$`training_file`) && length(input_json$`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", input_json$`training_file`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `training_file` is missing."))
      }
      # check the required field `validation_file`
      if (!is.null(input_json$`validation_file`)) {
        if (!(is.character(input_json$`validation_file`) && length(input_json$`validation_file`) == 1)) {
          stop(paste("Error! Invalid data for `validation_file`. Must be a string:", input_json$`validation_file`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `validation_file` is missing."))
      }
      # check the required field `seed`
      if (!is.null(input_json$`seed`)) {
        if (!(is.numeric(input_json$`seed`) && length(input_json$`seed`) == 1)) {
          stop(paste("Error! Invalid data for `seed`. Must be an integer:", input_json$`seed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTuningJob: the required field `seed` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTuningJob
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

      # check if the required `hyperparameters` is null
      if (is.null(self$`hyperparameters`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `organization_id` is null
      if (is.null(self$`organization_id`)) {
        return(FALSE)
      }

      # check if the required `result_files` is null
      if (is.null(self$`result_files`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        return(FALSE)
      }

      if (length(self$`integrations`) > 5) {
        return(FALSE)
      }

      # check if the required `seed` is null
      if (is.null(self$`seed`)) {
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

      # check if the required `hyperparameters` is null
      if (is.null(self$`hyperparameters`)) {
        invalid_fields["hyperparameters"] <- "Non-nullable required field `hyperparameters` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `organization_id` is null
      if (is.null(self$`organization_id`)) {
        invalid_fields["organization_id"] <- "Non-nullable required field `organization_id` cannot be null."
      }

      # check if the required `result_files` is null
      if (is.null(self$`result_files`)) {
        invalid_fields["result_files"] <- "Non-nullable required field `result_files` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        invalid_fields["training_file"] <- "Non-nullable required field `training_file` cannot be null."
      }

      if (length(self$`integrations`) > 5) {
        invalid_fields["integrations"] <- "Invalid length for `integrations`, number of items must be less than or equal to 5."
      }

      # check if the required `seed` is null
      if (is.null(self$`seed`)) {
        invalid_fields["seed"] <- "Non-nullable required field `seed` cannot be null."
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
# FineTuningJob$unlock()
#
## Below is an example to define the print function
# FineTuningJob$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTuningJob$lock()

