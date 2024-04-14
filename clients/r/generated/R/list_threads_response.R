#' Create a new ListThreadsResponse
#'
#' @description
#' ListThreadsResponse Class
#'
#' @docType class
#' @title ListThreadsResponse
#' @description ListThreadsResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field data  list(\link{ThreadObject})
#' @field first_id  character
#' @field last_id  character
#' @field has_more  character
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListThreadsResponse <- R6::R6Class(
  "ListThreadsResponse",
  public = list(
    `object` = NULL,
    `data` = NULL,
    `first_id` = NULL,
    `last_id` = NULL,
    `has_more` = NULL,
    #' Initialize a new ListThreadsResponse class.
    #'
    #' @description
    #' Initialize a new ListThreadsResponse class.
    #'
    #' @param object object
    #' @param data data
    #' @param first_id first_id
    #' @param last_id last_id
    #' @param has_more has_more
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`object`, `data`, `first_id`, `last_id`, `has_more`, ...) {
      if (!missing(`object`)) {
        if (!(is.character(`object`) && length(`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", `object`))
        }
        self$`object` <- `object`
      }
      if (!missing(`data`)) {
        stopifnot(is.vector(`data`), length(`data`) != 0)
        sapply(`data`, function(x) stopifnot(R6::is.R6(x)))
        self$`data` <- `data`
      }
      if (!missing(`first_id`)) {
        if (!(is.character(`first_id`) && length(`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", `first_id`))
        }
        self$`first_id` <- `first_id`
      }
      if (!missing(`last_id`)) {
        if (!(is.character(`last_id`) && length(`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", `last_id`))
        }
        self$`last_id` <- `last_id`
      }
      if (!missing(`has_more`)) {
        if (!(is.logical(`has_more`) && length(`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", `has_more`))
        }
        self$`has_more` <- `has_more`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListThreadsResponse in JSON format
    #' @export
    toJSON = function() {
      ListThreadsResponseObject <- list()
      if (!is.null(self$`object`)) {
        ListThreadsResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        ListThreadsResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      if (!is.null(self$`first_id`)) {
        ListThreadsResponseObject[["first_id"]] <-
          self$`first_id`
      }
      if (!is.null(self$`last_id`)) {
        ListThreadsResponseObject[["last_id"]] <-
          self$`last_id`
      }
      if (!is.null(self$`has_more`)) {
        ListThreadsResponseObject[["has_more"]] <-
          self$`has_more`
      }
      ListThreadsResponseObject
    },
    #' Deserialize JSON string into an instance of ListThreadsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListThreadsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListThreadsResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[ThreadObject]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`first_id`)) {
        self$`first_id` <- this_object$`first_id`
      }
      if (!is.null(this_object$`last_id`)) {
        self$`last_id` <- this_object$`last_id`
      }
      if (!is.null(this_object$`has_more`)) {
        self$`has_more` <- this_object$`has_more`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListThreadsResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`object`)) {
          sprintf(
          '"object":
            "%s"
                    ',
          self$`object`
          )
        },
        if (!is.null(self$`data`)) {
          sprintf(
          '"data":
          [%s]
',
          paste(sapply(self$`data`, function(x) jsonlite::toJSON(x$toJSON(), auto_unbox = TRUE, digits = NA)), collapse = ",")
          )
        },
        if (!is.null(self$`first_id`)) {
          sprintf(
          '"first_id":
            "%s"
                    ',
          self$`first_id`
          )
        },
        if (!is.null(self$`last_id`)) {
          sprintf(
          '"last_id":
            "%s"
                    ',
          self$`last_id`
          )
        },
        if (!is.null(self$`has_more`)) {
          sprintf(
          '"has_more":
            %s
                    ',
          tolower(self$`has_more`)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ListThreadsResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListThreadsResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListThreadsResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[ThreadObject]", loadNamespace("openapi"))
      self$`first_id` <- this_object$`first_id`
      self$`last_id` <- this_object$`last_id`
      self$`has_more` <- this_object$`has_more`
      self
    },
    #' Validate JSON input with respect to ListThreadsResponse
    #'
    #' @description
    #' Validate JSON input with respect to ListThreadsResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `object`
      if (!is.null(input_json$`object`)) {
        if (!(is.character(input_json$`object`) && length(input_json$`object`) == 1)) {
          stop(paste("Error! Invalid data for `object`. Must be a string:", input_json$`object`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListThreadsResponse: the required field `object` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListThreadsResponse: the required field `data` is missing."))
      }
      # check the required field `first_id`
      if (!is.null(input_json$`first_id`)) {
        if (!(is.character(input_json$`first_id`) && length(input_json$`first_id`) == 1)) {
          stop(paste("Error! Invalid data for `first_id`. Must be a string:", input_json$`first_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListThreadsResponse: the required field `first_id` is missing."))
      }
      # check the required field `last_id`
      if (!is.null(input_json$`last_id`)) {
        if (!(is.character(input_json$`last_id`) && length(input_json$`last_id`) == 1)) {
          stop(paste("Error! Invalid data for `last_id`. Must be a string:", input_json$`last_id`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListThreadsResponse: the required field `last_id` is missing."))
      }
      # check the required field `has_more`
      if (!is.null(input_json$`has_more`)) {
        if (!(is.logical(input_json$`has_more`) && length(input_json$`has_more`) == 1)) {
          stop(paste("Error! Invalid data for `has_more`. Must be a boolean:", input_json$`has_more`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListThreadsResponse: the required field `has_more` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListThreadsResponse
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        return(FALSE)
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        return(FALSE)
      }

      # check if the required `first_id` is null
      if (is.null(self$`first_id`)) {
        return(FALSE)
      }

      # check if the required `last_id` is null
      if (is.null(self$`last_id`)) {
        return(FALSE)
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
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
      # check if the required `object` is null
      if (is.null(self$`object`)) {
        invalid_fields["object"] <- "Non-nullable required field `object` cannot be null."
      }

      # check if the required `data` is null
      if (is.null(self$`data`)) {
        invalid_fields["data"] <- "Non-nullable required field `data` cannot be null."
      }

      # check if the required `first_id` is null
      if (is.null(self$`first_id`)) {
        invalid_fields["first_id"] <- "Non-nullable required field `first_id` cannot be null."
      }

      # check if the required `last_id` is null
      if (is.null(self$`last_id`)) {
        invalid_fields["last_id"] <- "Non-nullable required field `last_id` cannot be null."
      }

      # check if the required `has_more` is null
      if (is.null(self$`has_more`)) {
        invalid_fields["has_more"] <- "Non-nullable required field `has_more` cannot be null."
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
# ListThreadsResponse$unlock()
#
## Below is an example to define the print function
# ListThreadsResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListThreadsResponse$lock()

