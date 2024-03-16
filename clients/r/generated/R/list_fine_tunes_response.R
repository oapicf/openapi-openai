#' Create a new ListFineTunesResponse
#'
#' @description
#' ListFineTunesResponse Class
#'
#' @docType class
#' @title ListFineTunesResponse
#' @description ListFineTunesResponse Class
#' @format An \code{R6Class} generator object
#' @field object  character
#' @field data  list(\link{FineTune})
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ListFineTunesResponse <- R6::R6Class(
  "ListFineTunesResponse",
  public = list(
    `object` = NULL,
    `data` = NULL,
    #' Initialize a new ListFineTunesResponse class.
    #'
    #' @description
    #' Initialize a new ListFineTunesResponse class.
    #'
    #' @param object object
    #' @param data data
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`object`, `data`, ...) {
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
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListFineTunesResponse in JSON format
    #' @export
    toJSON = function() {
      ListFineTunesResponseObject <- list()
      if (!is.null(self$`object`)) {
        ListFineTunesResponseObject[["object"]] <-
          self$`object`
      }
      if (!is.null(self$`data`)) {
        ListFineTunesResponseObject[["data"]] <-
          lapply(self$`data`, function(x) x$toJSON())
      }
      ListFineTunesResponseObject
    },
    #' Deserialize JSON string into an instance of ListFineTunesResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListFineTunesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListFineTunesResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`object`)) {
        self$`object` <- this_object$`object`
      }
      if (!is.null(this_object$`data`)) {
        self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTune]", loadNamespace("openapi"))
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ListFineTunesResponse in JSON format
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
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ListFineTunesResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ListFineTunesResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ListFineTunesResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`object` <- this_object$`object`
      self$`data` <- ApiClient$new()$deserializeObj(this_object$`data`, "array[FineTune]", loadNamespace("openapi"))
      self
    },
    #' Validate JSON input with respect to ListFineTunesResponse
    #'
    #' @description
    #' Validate JSON input with respect to ListFineTunesResponse and throw an exception if invalid
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
        stop(paste("The JSON input `", input, "` is invalid for ListFineTunesResponse: the required field `object` is missing."))
      }
      # check the required field `data`
      if (!is.null(input_json$`data`)) {
        stopifnot(is.vector(input_json$`data`), length(input_json$`data`) != 0)
        tmp <- sapply(input_json$`data`, function(x) stopifnot(R6::is.R6(x)))
      } else {
        stop(paste("The JSON input `", input, "` is invalid for ListFineTunesResponse: the required field `data` is missing."))
      }
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ListFineTunesResponse
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
# ListFineTunesResponse$unlock()
#
## Below is an example to define the print function
# ListFineTunesResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ListFineTunesResponse$lock()

