#' Create a new CreateFineTuningJobRequest
#'
#' @description
#' CreateFineTuningJobRequest Class
#'
#' @docType class
#' @title CreateFineTuningJobRequest
#' @description CreateFineTuningJobRequest Class
#' @format An \code{R6Class} generator object
#' @field model  \link{CreateFineTuningJobRequestModel}
#' @field training_file The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. character
#' @field hyperparameters  \link{CreateFineTuningJobRequestHyperparameters} [optional]
#' @field suffix A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`. character [optional]
#' @field validation_file The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. character [optional]
#' @field integrations A list of integrations to enable for your fine-tuning job. list(\link{CreateFineTuningJobRequestIntegrationsInner}) [optional]
#' @field seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateFineTuningJobRequest <- R6::R6Class(
  "CreateFineTuningJobRequest",
  public = list(
    `model` = NULL,
    `training_file` = NULL,
    `hyperparameters` = NULL,
    `suffix` = NULL,
    `validation_file` = NULL,
    `integrations` = NULL,
    `seed` = NULL,
    #' Initialize a new CreateFineTuningJobRequest class.
    #'
    #' @description
    #' Initialize a new CreateFineTuningJobRequest class.
    #'
    #' @param model model
    #' @param training_file The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
    #' @param hyperparameters hyperparameters
    #' @param suffix A string of up to 18 characters that will be added to your fine-tuned model name.  For example, a `suffix` of \"custom-model-name\" would produce a model name like `ft:gpt-3.5-turbo:openai:custom-model-name:7p4lURel`.
    #' @param validation_file The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
    #' @param integrations A list of integrations to enable for your fine-tuning job.
    #' @param seed The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`model`, `training_file`, `hyperparameters` = NULL, `suffix` = NULL, `validation_file` = NULL, `integrations` = NULL, `seed` = NULL, ...) {
      if (!missing(`model`)) {
        stopifnot(R6::is.R6(`model`))
        self$`model` <- `model`
      }
      if (!missing(`training_file`)) {
        if (!(is.character(`training_file`) && length(`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", `training_file`))
        }
        self$`training_file` <- `training_file`
      }
      if (!is.null(`hyperparameters`)) {
        stopifnot(R6::is.R6(`hyperparameters`))
        self$`hyperparameters` <- `hyperparameters`
      }
      if (!is.null(`suffix`)) {
        if (!(is.character(`suffix`) && length(`suffix`) == 1)) {
          stop(paste("Error! Invalid data for `suffix`. Must be a string:", `suffix`))
        }
        self$`suffix` <- `suffix`
      }
      if (!is.null(`validation_file`)) {
        if (!(is.character(`validation_file`) && length(`validation_file`) == 1)) {
          stop(paste("Error! Invalid data for `validation_file`. Must be a string:", `validation_file`))
        }
        self$`validation_file` <- `validation_file`
      }
      if (!is.null(`integrations`)) {
        stopifnot(is.vector(`integrations`), length(`integrations`) != 0)
        sapply(`integrations`, function(x) stopifnot(R6::is.R6(x)))
        self$`integrations` <- `integrations`
      }
      if (!is.null(`seed`)) {
        if (!(is.numeric(`seed`) && length(`seed`) == 1)) {
          stop(paste("Error! Invalid data for `seed`. Must be an integer:", `seed`))
        }
        self$`seed` <- `seed`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequest in JSON format
    #' @export
    toJSON = function() {
      CreateFineTuningJobRequestObject <- list()
      if (!is.null(self$`model`)) {
        CreateFineTuningJobRequestObject[["model"]] <-
          self$`model`$toJSON()
      }
      if (!is.null(self$`training_file`)) {
        CreateFineTuningJobRequestObject[["training_file"]] <-
          self$`training_file`
      }
      if (!is.null(self$`hyperparameters`)) {
        CreateFineTuningJobRequestObject[["hyperparameters"]] <-
          self$`hyperparameters`$toJSON()
      }
      if (!is.null(self$`suffix`)) {
        CreateFineTuningJobRequestObject[["suffix"]] <-
          self$`suffix`
      }
      if (!is.null(self$`validation_file`)) {
        CreateFineTuningJobRequestObject[["validation_file"]] <-
          self$`validation_file`
      }
      if (!is.null(self$`integrations`)) {
        CreateFineTuningJobRequestObject[["integrations"]] <-
          lapply(self$`integrations`, function(x) x$toJSON())
      }
      if (!is.null(self$`seed`)) {
        CreateFineTuningJobRequestObject[["seed"]] <-
          self$`seed`
      }
      CreateFineTuningJobRequestObject
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequest
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`model`)) {
        `model_object` <- CreateFineTuningJobRequestModel$new()
        `model_object`$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
        self$`model` <- `model_object`
      }
      if (!is.null(this_object$`training_file`)) {
        self$`training_file` <- this_object$`training_file`
      }
      if (!is.null(this_object$`hyperparameters`)) {
        `hyperparameters_object` <- CreateFineTuningJobRequestHyperparameters$new()
        `hyperparameters_object`$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
        self$`hyperparameters` <- `hyperparameters_object`
      }
      if (!is.null(this_object$`suffix`)) {
        self$`suffix` <- this_object$`suffix`
      }
      if (!is.null(this_object$`validation_file`)) {
        self$`validation_file` <- this_object$`validation_file`
      }
      if (!is.null(this_object$`integrations`)) {
        self$`integrations` <- ApiClient$new()$deserializeObj(this_object$`integrations`, "array[CreateFineTuningJobRequestIntegrationsInner]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`seed`)) {
        self$`seed` <- this_object$`seed`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateFineTuningJobRequest in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
          %s
          ',
          jsonlite::toJSON(self$`model`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`training_file`)) {
          sprintf(
          '"training_file":
            "%s"
                    ',
          self$`training_file`
          )
        },
        if (!is.null(self$`hyperparameters`)) {
          sprintf(
          '"hyperparameters":
          %s
          ',
          jsonlite::toJSON(self$`hyperparameters`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`suffix`)) {
          sprintf(
          '"suffix":
            "%s"
                    ',
          self$`suffix`
          )
        },
        if (!is.null(self$`validation_file`)) {
          sprintf(
          '"validation_file":
            "%s"
                    ',
          self$`validation_file`
          )
        },
        if (!is.null(self$`integrations`)) {
          sprintf(
          '"integrations":
          [%s]
',
          paste(sapply(self$`integrations`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`seed`)) {
          sprintf(
          '"seed":
            %d
                    ',
          self$`seed`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequest
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequest
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateFineTuningJobRequest
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`model` <- CreateFineTuningJobRequestModel$new()$fromJSON(jsonlite::toJSON(this_object$`model`, auto_unbox = TRUE, digits = NA))
      self$`training_file` <- this_object$`training_file`
      self$`hyperparameters` <- CreateFineTuningJobRequestHyperparameters$new()$fromJSON(jsonlite::toJSON(this_object$`hyperparameters`, auto_unbox = TRUE, digits = NA))
      self$`suffix` <- this_object$`suffix`
      self$`validation_file` <- this_object$`validation_file`
      self$`integrations` <- ApiClient$new()$deserializeObj(this_object$`integrations`, "array[CreateFineTuningJobRequestIntegrationsInner]", loadNamespace("openapi"))
      self$`seed` <- this_object$`seed`
      self
    },
    #' Validate JSON input with respect to CreateFineTuningJobRequest
    #'
    #' @description
    #' Validate JSON input with respect to CreateFineTuningJobRequest and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        stopifnot(R6::is.R6(input_json$`model`))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateFineTuningJobRequest: the required field `model` is missing."))
      }
      # check the required field `training_file`
      if (!is.null(input_json$`training_file`)) {
        if (!(is.character(input_json$`training_file`) && length(input_json$`training_file`) == 1)) {
          stop(paste("Error! Invalid data for `training_file`. Must be a string:", input_json$`training_file`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateFineTuningJobRequest: the required field `training_file` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateFineTuningJobRequest
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        return(FALSE)
      }

      if (nchar(self$`suffix`) > 40) {
        return(FALSE)
      }
      if (nchar(self$`suffix`) < 1) {
        return(FALSE)
      }

      if (self$`seed` > 2147483647) {
        return(FALSE)
      }
      if (self$`seed` < 0) {
        return(FALSE)
      }

      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `training_file` is null
      if (is.null(self$`training_file`)) {
        invalid_fields["training_file"] <- "Non-nullable required field `training_file` cannot be null."
      }

      if (nchar(self$`suffix`) > 40) {
        invalid_fields["suffix"] <- "Invalid length for `suffix`, must be smaller than or equal to 40."
      }
      if (nchar(self$`suffix`) < 1) {
        invalid_fields["suffix"] <- "Invalid length for `suffix`, must be bigger than or equal to 1."
      }

      if (self$`seed` > 2147483647) {
        invalid_fields["seed"] <- "Invalid value for `seed`, must be smaller than or equal to 2147483647."
      }
      if (self$`seed` < 0) {
        invalid_fields["seed"] <- "Invalid value for `seed`, must be bigger than or equal to 0."
      }

      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# CreateFineTuningJobRequest$unlock()
#
## Below is an example to define the print function
# CreateFineTuningJobRequest$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateFineTuningJobRequest$lock()

