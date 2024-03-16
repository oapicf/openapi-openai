#' Create a new FineTune
#'
#' @description
#' FineTune Class
#'
#' @docType class
#' @title FineTune
#' @description FineTune Class
#' @format An \code{R6Class} generator object
#' @field id  character
#' @field object  character
#' @field created_at  integer
#' @field updated_at  integer
#' @field model  character
#' @field fine_tuned_model  character
#' @field organization_id  character
#' @field status  character
#' @field hyperparams  object
#' @field training_files  list(\link{OpenAIFile})
#' @field validation_files  list(\link{OpenAIFile})
#' @field result_files  list(\link{OpenAIFile})
#' @field events  list(\link{FineTuneEvent}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
FineTune <- R6::R6Class(
  "FineTune",
  public = list(
    `id` = NULL,
    `object` = NULL,
    `created_at` = NULL,
    `updated_at` = NULL,
    `model` = NULL,
    `fine_tuned_model` = NULL,
    `organization_id` = NULL,
    `status` = NULL,
    `hyperparams` = NULL,
    `training_files` = NULL,
    `validation_files` = NULL,
    `result_files` = NULL,
    `events` = NULL,
    #' Initialize a new FineTune class.
    #'
    #' @description
    #' Initialize a new FineTune class.
    #'
    #' @param id id
    #' @param object object
    #' @param created_at created_at
    #' @param updated_at updated_at
    #' @param model model
    #' @param fine_tuned_model fine_tuned_model
    #' @param organization_id organization_id
    #' @param status status
    #' @param hyperparams hyperparams
    #' @param training_files training_files
    #' @param validation_files validation_files
    #' @param result_files result_files
    #' @param events events
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `object`, `created_at`, `updated_at`, `model`, `fine_tuned_model`, `organization_id`, `status`, `hyperparams`, `training_files`, `validation_files`, `result_files`, `events` = NULL, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`created_at`)) {
        if (!(is.numeric(`created_at`) && length(`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", `created_at`))
        }
        self$`created_at` <- `created_at`
      }
      if (!missing(`updated_at`)) {
        if (!(is.numeric(`updated_at`) && length(`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be an integer:", `updated_at`))
        }
        self$`updated_at` <- `updated_at`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`fine_tuned_model`)) {
        if (!(is.character(`fine_tuned_model`) && length(`fine_tuned_model`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model`. Must be a string:", `fine_tuned_model`))
        }
        self$`fine_tuned_model` <- `fine_tuned_model`
      }
      if (!missing(`organization_id`)) {
        if (!(is.character(`organization_id`) && length(`organization_id`) == 1)) {
          stop(paste("Error! Invalid data for `organization_id`. Must be a string:", `organization_id`))
        }
        self$`organization_id` <- `organization_id`
      }
      if (!missing(`status`)) {
        if (!(is.character(`status`) && length(`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", `status`))
        }
        self$`status` <- `status`
      }
      if (!missing(`hyperparams`)) {
        self$`hyperparams` <- `hyperparams`
      }
      if (!missing(`training_files`)) {
        stopifnot(is.vector(`training_files`), length(`training_files`) != 0)
        sapply(`training_files`, function(x) stopifnot(R6::is.R6(x)))
        self$`training_files` <- `training_files`
      }
      if (!missing(`validation_files`)) {
        stopifnot(is.vector(`validation_files`), length(`validation_files`) != 0)
        sapply(`validation_files`, function(x) stopifnot(R6::is.R6(x)))
        self$`validation_files` <- `validation_files`
      }
      if (!missing(`result_files`)) {
        stopifnot(is.vector(`result_files`), length(`result_files`) != 0)
        sapply(`result_files`, function(x) stopifnot(R6::is.R6(x)))
        self$`result_files` <- `result_files`
      }
      if (!is.null(`events`)) {
        stopifnot(is.vector(`events`), length(`events`) != 0)
        sapply(`events`, function(x) stopifnot(R6::is.R6(x)))
        self$`events` <- `events`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTune in JSON format
    #' @export
    toJSON = function() {
      FineTuneObject <- list()
      if (!is.null(self$`id`)) {
        FineTuneObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`object`)) {
        FineTuneObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`created_at`)) {
        FineTuneObject[["created_at"]] <-
          self$`created_at`
      }
      if (!is.null(self$`updated_at`)) {
        FineTuneObject[["updated_at"]] <-
          self$`updated_at`
      }
      if (!is.null(self$`model`)) {
        FineTuneObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`fine_tuned_model`)) {
        FineTuneObject[["fine_tuned_model"]] <-
          self$`fine_tuned_model`
      }
      if (!is.null(self$`organization_id`)) {
        FineTuneObject[["organization_id"]] <-
          self$`organization_id`
      }
      if (!is.null(self$`status`)) {
        FineTuneObject[["status"]] <-
          self$`status`
      }
      if (!is.null(self$`hyperparams`)) {
        FineTuneObject[["hyperparams"]] <-
          self$`hyperparams`
      }
      if (!is.null(self$`training_files`)) {
        FineTuneObject[["training_files"]] <-
          lapply(self$`training_files`, function(x) x$toJSON())
      }
      if (!is.null(self$`validation_files`)) {
        FineTuneObject[["validation_files"]] <-
          lapply(self$`validation_files`, function(x) x$toJSON())
      }
      if (!is.null(self$`result_files`)) {
        FineTuneObject[["result_files"]] <-
          lapply(self$`result_files`, function(x) x$toJSON())
      }
      if (!is.null(self$`events`)) {
        FineTuneObject[["events"]] <-
          lapply(self$`events`, function(x) x$toJSON())
      }
      FineTuneObject
    },
    #' Deserialize JSON string into an instance of FineTune
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTune
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTune
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`created_at`)) {
        self$`created_at` <- this_object$`created_at`
      }
      if (!is.null(this_object$`updated_at`)) {
        self$`updated_at` <- this_object$`updated_at`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`fine_tuned_model`)) {
        self$`fine_tuned_model` <- this_object$`fine_tuned_model`
      }
      if (!is.null(this_object$`organization_id`)) {
        self$`organization_id` <- this_object$`organization_id`
      }
      if (!is.null(this_object$`status`)) {
        self$`status` <- this_object$`status`
      }
      if (!is.null(this_object$`hyperparams`)) {
        self$`hyperparams` <- this_object$`hyperparams`
      }
      if (!is.null(this_object$`training_files`)) {
        self$`training_files` <- ApiClient$new()$deserializeObj(this_object$`training_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`validation_files`)) {
        self$`validation_files` <- ApiClient$new()$deserializeObj(this_object$`validation_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`result_files`)) {
        self$`result_files` <- ApiClient$new()$deserializeObj(this_object$`result_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`events`)) {
        self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[FineTuneEvent]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return FineTune in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`id`)) {
          sprintf(
          '"id":
            "%s"
                    ',
          self$`id`
          )
        },
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`created_at`)) {
          sprintf(
          '"created_at":
            %d
                    ',
          self$`created_at`
          )
        },
        if (!is.null(self$`updated_at`)) {
          sprintf(
          '"updated_at":
            %d
                    ',
          self$`updated_at`
          )
        },
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
            "%s"
                    ',
          self$`model`
          )
        },
        if (!is.null(self$`fine_tuned_model`)) {
          sprintf(
          '"fine_tuned_model":
            "%s"
                    ',
          self$`fine_tuned_model`
          )
        },
        if (!is.null(self$`organization_id`)) {
          sprintf(
          '"organization_id":
            "%s"
                    ',
          self$`organization_id`
          )
        },
        if (!is.null(self$`status`)) {
          sprintf(
          '"status":
            "%s"
                    ',
          self$`status`
          )
        },
        if (!is.null(self$`hyperparams`)) {
          sprintf(
          '"hyperparams":
            "%s"
                    ',
          self$`hyperparams`
          )
        },
        if (!is.null(self$`training_files`)) {
          sprintf(
          '"training_files":
          [%s]
',
          paste(sapply(self$`training_files`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`validation_files`)) {
          sprintf(
          '"validation_files":
          [%s]
',
          paste(sapply(self$`validation_files`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`result_files`)) {
          sprintf(
          '"result_files":
          [%s]
',
          paste(sapply(self$`result_files`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`events`)) {
          sprintf(
          '"events":
          [%s]
',
          paste(sapply(self$`events`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of FineTune
    #'
    #' @description
    #' Deserialize JSON string into an instance of FineTune
    #'
    #' @param input_json the JSON input
    #' @return the instance of FineTune
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`object` <- this_object$`object`
      self$`created_at` <- this_object$`created_at`
      self$`updated_at` <- this_object$`updated_at`
      self$`model` <- this_object$`model`
      self$`fine_tuned_model` <- this_object$`fine_tuned_model`
      self$`organization_id` <- this_object$`organization_id`
      self$`status` <- this_object$`status`
      self$`hyperparams` <- this_object$`hyperparams`
      self$`training_files` <- ApiClient$new()$deserializeObj(this_object$`training_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      self$`validation_files` <- ApiClient$new()$deserializeObj(this_object$`validation_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      self$`result_files` <- ApiClient$new()$deserializeObj(this_object$`result_files`, "array[OpenAIFile]", loadNamespace("openapi"))
      self$`events` <- ApiClient$new()$deserializeObj(this_object$`events`, "array[FineTuneEvent]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to FineTune
    #'
    #' @description
    #' Validate JSON input with respect to FineTune and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `id`
      if (!is.null(input_json$`id`)) {
        if (!(is.character(input_json$`id`) && length(input_json$`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", input_json$`id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `id` is missing."))
      }
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `object` is missing."))
      }
      # check the required field `created_at`
      if (!is.null(input_json$`created_at`)) {
        if (!(is.numeric(input_json$`created_at`) && length(input_json$`created_at`) == 1)) {
          stop(paste("Error! Invalid data for `created_at`. Must be an integer:", input_json$`created_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `created_at` is missing."))
      }
      # check the required field `updated_at`
      if (!is.null(input_json$`updated_at`)) {
        if (!(is.numeric(input_json$`updated_at`) && length(input_json$`updated_at`) == 1)) {
          stop(paste("Error! Invalid data for `updated_at`. Must be an integer:", input_json$`updated_at`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `updated_at` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `model` is missing."))
      }
      # check the required field `fine_tuned_model`
      if (!is.null(input_json$`fine_tuned_model`)) {
        if (!(is.character(input_json$`fine_tuned_model`) && length(input_json$`fine_tuned_model`) == 1)) {
          stop(paste("Error! Invalid data for `fine_tuned_model`. Must be a string:", input_json$`fine_tuned_model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `fine_tuned_model` is missing."))
      }
      # check the required field `organization_id`
      if (!is.null(input_json$`organization_id`)) {
        if (!(is.character(input_json$`organization_id`) && length(input_json$`organization_id`) == 1)) {
          stop(paste("Error! Invalid data for `organization_id`. Must be a string:", input_json$`organization_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `organization_id` is missing."))
      }
      # check the required field `status`
      if (!is.null(input_json$`status`)) {
        if (!(is.character(input_json$`status`) && length(input_json$`status`) == 1)) {
          stop(paste("Error! Invalid data for `status`. Must be a string:", input_json$`status`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `status` is missing."))
      }
      # check the required field `hyperparams`
      if (!is.null(input_json$`hyperparams`)) {
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `hyperparams` is missing."))
      }
      # check the required field `training_files`
      if (!is.null(input_json$`training_files`)) {
        stopifnot(is.vector(input_json$`training_files`), length(input_json$`training_files`) != 0)
        tmp <- sapply(input_json$`training_files`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `training_files` is missing."))
      }
      # check the required field `validation_files`
      if (!is.null(input_json$`validation_files`)) {
        stopifnot(is.vector(input_json$`validation_files`), length(input_json$`validation_files`) != 0)
        tmp <- sapply(input_json$`validation_files`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `validation_files` is missing."))
      }
      # check the required field `result_files`
      if (!is.null(input_json$`result_files`)) {
        stopifnot(is.vector(input_json$`result_files`), length(input_json$`result_files`) != 0)
        tmp <- sapply(input_json$`result_files`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for FineTune: the required field `result_files` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of FineTune
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        return(FALSE)
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        return(FALSE)
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
        return(FALSE)
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `organization_id` is null
      if (is.null(self$`organization_id`)) {
        return(FALSE)
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        return(FALSE)
      }

      # check if the required `hyperparams` is null
      if (is.null(self$`hyperparams`)) {
        return(FALSE)
      }

      # check if the required `training_files` is null
      if (is.null(self$`training_files`)) {
        return(FALSE)
      }

      # check if the required `validation_files` is null
      if (is.null(self$`validation_files`)) {
        return(FALSE)
      }

      # check if the required `result_files` is null
      if (is.null(self$`result_files`)) {
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
      # check if the required `id` is null
      if (is.null(self$`id`)) {
        invalid_fields["id"] <- "Non-nullable required field `id` cannot be null."
      }

      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `created_at` is null
      if (is.null(self$`created_at`)) {
        invalid_fields["created_at"] <- "Non-nullable required field `created_at` cannot be null."
      }

      # check if the required `updated_at` is null
      if (is.null(self$`updated_at`)) {
        invalid_fields["updated_at"] <- "Non-nullable required field `updated_at` cannot be null."
      }

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `organization_id` is null
      if (is.null(self$`organization_id`)) {
        invalid_fields["organization_id"] <- "Non-nullable required field `organization_id` cannot be null."
      }

      # check if the required `status` is null
      if (is.null(self$`status`)) {
        invalid_fields["status"] <- "Non-nullable required field `status` cannot be null."
      }

      # check if the required `hyperparams` is null
      if (is.null(self$`hyperparams`)) {
        invalid_fields["hyperparams"] <- "Non-nullable required field `hyperparams` cannot be null."
      }

      # check if the required `training_files` is null
      if (is.null(self$`training_files`)) {
        invalid_fields["training_files"] <- "Non-nullable required field `training_files` cannot be null."
      }

      # check if the required `validation_files` is null
      if (is.null(self$`validation_files`)) {
        invalid_fields["validation_files"] <- "Non-nullable required field `validation_files` cannot be null."
      }

      # check if the required `result_files` is null
      if (is.null(self$`result_files`)) {
        invalid_fields["result_files"] <- "Non-nullable required field `result_files` cannot be null."
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
# FineTune$unlock()
#
## Below is an example to define the print function
# FineTune$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# FineTune$lock()

