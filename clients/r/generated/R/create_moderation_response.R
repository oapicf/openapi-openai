#' Create a new CreateModerationResponse
#'
#' @description
#' Represents if a given text input is potentially harmful.
#'
#' @docType class
#' @title CreateModerationResponse
#' @description CreateModerationResponse Class
#' @format An \code{R6Class} generator object
#' @field id The unique identifier for the moderation request. character
#' @field model The model used to generate the moderation results. character
#' @field results A list of moderation objects. list(\link{CreateModerationResponseResultsInner})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateModerationResponse <- R6::R6Class(
  "CreateModerationResponse",
  public = list(
    `id` = NULL,
    `model` = NULL,
    `results` = NULL,
    #' Initialize a new CreateModerationResponse class.
    #'
    #' @description
    #' Initialize a new CreateModerationResponse class.
    #'
    #' @param id The unique identifier for the moderation request.
    #' @param model The model used to generate the moderation results.
    #' @param results A list of moderation objects.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`id`, `model`, `results`, ...) {
      if (!missing(`id`)) {
        if (!(is.character(`id`) && length(`id`) == 1)) {
          stop(paste("Error! Invalid data for `id`. Must be a string:", `id`))
        }
        self$`id` <- `id`
      }
      if (!missing(`model`)) {
        if (!(is.character(`model`) && length(`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", `model`))
        }
        self$`model` <- `model`
      }
      if (!missing(`results`)) {
        stopifnot(is.vector(`results`), length(`results`) != 0)
        sapply(`results`, function(x) stopifnot(R6::is.R6(x)))
        self$`results` <- `results`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponse in JSON format
    #' @export
    toJSON = function() {
      CreateModerationResponseObject <- list()
      if (!is.null(self$`id`)) {
        CreateModerationResponseObject[["id"]] <-
          self$`id`
      }
      if (!is.null(self$`model`)) {
        CreateModerationResponseObject[["model"]] <-
          self$`model`
      }
      if (!is.null(self$`results`)) {
        CreateModerationResponseObject[["results"]] <-
          lapply(self$`results`, function(x) x$toJSON())
      }
      CreateModerationResponseObject
    },
    #' Deserialize JSON string into an instance of CreateModerationResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`id`)) {
        self$`id` <- this_object$`id`
      }
      if (!is.null(this_object$`model`)) {
        self$`model` <- this_object$`model`
      }
      if (!is.null(this_object$`results`)) {
        self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[CreateModerationResponseResultsInner]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return CreateModerationResponse in JSON format
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
        if (!is.null(self$`model`)) {
          sprintf(
          '"model":
            "%s"
                    ',
          self$`model`
          )
        },
        if (!is.null(self$`results`)) {
          sprintf(
          '"results":
          [%s]
',
          paste(sapply(self$`results`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of CreateModerationResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateModerationResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateModerationResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`id` <- this_object$`id`
      self$`model` <- this_object$`model`
      self$`results` <- ApiClient$new()$deserializeObj(this_object$`results`, "array[CreateModerationResponseResultsInner]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to CreateModerationResponse
    #'
    #' @description
    #' Validate JSON input with respect to CreateModerationResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponse: the required field `id` is missing."))
      }
      # check the required field `model`
      if (!is.null(input_json$`model`)) {
        if (!(is.character(input_json$`model`) && length(input_json$`model`) == 1)) {
          stop(paste("Error! Invalid data for `model`. Must be a string:", input_json$`model`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponse: the required field `model` is missing."))
      }
      # check the required field `results`
      if (!is.null(input_json$`results`)) {
        stopifnot(is.vector(input_json$`results`), length(input_json$`results`) != 0)
        tmp <- sapply(input_json$`results`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for CreateModerationResponse: the required field `results` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateModerationResponse
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

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        return(FALSE)
      }

      # check if the required `results` is null
      if (is.null(self$`results`)) {
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

      # check if the required `model` is null
      if (is.null(self$`model`)) {
        invalid_fields["model"] <- "Non-nullable required field `model` cannot be null."
      }

      # check if the required `results` is null
      if (is.null(self$`results`)) {
        invalid_fields["results"] <- "Non-nullable required field `results` cannot be null."
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
# CreateModerationResponse$unlock()
#
## Below is an example to define the print function
# CreateModerationResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateModerationResponse$lock()

