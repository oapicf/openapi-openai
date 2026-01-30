#' Create a new BatchRequestInput
#'
#' @description
#' The per-line object of the batch input file
#'
#' @docType class
#' @title BatchRequestInput
#' @description BatchRequestInput Class
#' @format An \code{R6Class} generator object
#' @field custom_id A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. character [optional]
#' @field method The HTTP method to be used for the request. Currently only `POST` is supported. character [optional]
#' @field url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. character [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchRequestInput <- R6::R6Class(
  "BatchRequestInput",
  public = list(
    `custom_id` = NULL,
    `method` = NULL,
    `url` = NULL,

    #' @description
    #' Initialize a new BatchRequestInput class.
    #'
    #' @param custom_id A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
    #' @param method The HTTP method to be used for the request. Currently only `POST` is supported.
    #' @param url The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
    #' @param ... Other optional arguments.
    initialize = function(`custom_id` = NULL, `method` = NULL, `url` = NULL, ...) {
      if (!is.null(`custom_id`)) {
        if (!(is.character(`custom_id`) && length(`custom_id`) == 1)) {
          stop(paste("Error! Invalid data for `custom_id`. Must be a string:", `custom_id`))
        }
        self$`custom_id` <- `custom_id`
      }
      if (!is.null(`method`)) {
        if (!(`method` %in% c("POST"))) {
          stop(paste("Error! \"", `method`, "\" cannot be assigned to `method`. Must be \"POST\".", sep = ""))
        }
        if (!(is.character(`method`) && length(`method`) == 1)) {
          stop(paste("Error! Invalid data for `method`. Must be a string:", `method`))
        }
        self$`method` <- `method`
      }
      if (!is.null(`url`)) {
        if (!(is.character(`url`) && length(`url`) == 1)) {
          stop(paste("Error! Invalid data for `url`. Must be a string:", `url`))
        }
        self$`url` <- `url`
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
    #' @return BatchRequestInput as a base R list.
    #' @examples
    #' # convert array of BatchRequestInput (x) to a data frame
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
    #' Convert BatchRequestInput to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchRequestInputObject <- list()
      if (!is.null(self$`custom_id`)) {
        BatchRequestInputObject[["custom_id"]] <-
          self$`custom_id`
      }
      if (!is.null(self$`method`)) {
        BatchRequestInputObject[["method"]] <-
          self$`method`
      }
      if (!is.null(self$`url`)) {
        BatchRequestInputObject[["url"]] <-
          self$`url`
      }
      return(BatchRequestInputObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestInput
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`custom_id`)) {
        self$`custom_id` <- this_object$`custom_id`
      }
      if (!is.null(this_object$`method`)) {
        if (!is.null(this_object$`method`) && !(this_object$`method` %in% c("POST"))) {
          stop(paste("Error! \"", this_object$`method`, "\" cannot be assigned to `method`. Must be \"POST\".", sep = ""))
        }
        self$`method` <- this_object$`method`
      }
      if (!is.null(this_object$`url`)) {
        self$`url` <- this_object$`url`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchRequestInput in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestInput
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestInput
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`custom_id` <- this_object$`custom_id`
      if (!is.null(this_object$`method`) && !(this_object$`method` %in% c("POST"))) {
        stop(paste("Error! \"", this_object$`method`, "\" cannot be assigned to `method`. Must be \"POST\".", sep = ""))
      }
      self$`method` <- this_object$`method`
      self$`url` <- this_object$`url`
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchRequestInput and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchRequestInput
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
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
# BatchRequestInput$unlock()
#
## Below is an example to define the print function
# BatchRequestInput$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchRequestInput$lock()

