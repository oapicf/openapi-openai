#' Create a new BatchRequestCounts
#'
#' @description
#' The request counts for different statuses within the batch.
#'
#' @docType class
#' @title BatchRequestCounts
#' @description BatchRequestCounts Class
#' @format An \code{R6Class} generator object
#' @field total Total number of requests in the batch. integer
#' @field completed Number of requests that have been completed successfully. integer
#' @field failed Number of requests that have failed. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
BatchRequestCounts <- R6::R6Class(
  "BatchRequestCounts",
  public = list(
    `total` = NULL,
    `completed` = NULL,
    `failed` = NULL,

    #' @description
    #' Initialize a new BatchRequestCounts class.
    #'
    #' @param total Total number of requests in the batch.
    #' @param completed Number of requests that have been completed successfully.
    #' @param failed Number of requests that have failed.
    #' @param ... Other optional arguments.
    initialize = function(`total`, `completed`, `failed`, ...) {
      if (!missing(`total`)) {
        if (!(is.numeric(`total`) && length(`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", `total`))
        }
        self$`total` <- `total`
      }
      if (!missing(`completed`)) {
        if (!(is.numeric(`completed`) && length(`completed`) == 1)) {
          stop(paste("Error! Invalid data for `completed`. Must be an integer:", `completed`))
        }
        self$`completed` <- `completed`
      }
      if (!missing(`failed`)) {
        if (!(is.numeric(`failed`) && length(`failed`) == 1)) {
          stop(paste("Error! Invalid data for `failed`. Must be an integer:", `failed`))
        }
        self$`failed` <- `failed`
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
    #' @return BatchRequestCounts as a base R list.
    #' @examples
    #' # convert array of BatchRequestCounts (x) to a data frame
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
    #' Convert BatchRequestCounts to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      BatchRequestCountsObject <- list()
      if (!is.null(self$`total`)) {
        BatchRequestCountsObject[["total"]] <-
          self$`total`
      }
      if (!is.null(self$`completed`)) {
        BatchRequestCountsObject[["completed"]] <-
          self$`completed`
      }
      if (!is.null(self$`failed`)) {
        BatchRequestCountsObject[["failed"]] <-
          self$`failed`
      }
      return(BatchRequestCountsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      if (!is.null(this_object$`completed`)) {
        self$`completed` <- this_object$`completed`
      }
      if (!is.null(this_object$`failed`)) {
        self$`failed` <- this_object$`failed`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return BatchRequestCounts in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of BatchRequestCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of BatchRequestCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`total` <- this_object$`total`
      self$`completed` <- this_object$`completed`
      self$`failed` <- this_object$`failed`
      self
    },

    #' @description
    #' Validate JSON input with respect to BatchRequestCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
        if (!(is.numeric(input_json$`total`) && length(input_json$`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", input_json$`total`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BatchRequestCounts: the required field `total` is missing."))
      }
      # check the required field `completed`
      if (!is.null(input_json$`completed`)) {
        if (!(is.numeric(input_json$`completed`) && length(input_json$`completed`) == 1)) {
          stop(paste("Error! Invalid data for `completed`. Must be an integer:", input_json$`completed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BatchRequestCounts: the required field `completed` is missing."))
      }
      # check the required field `failed`
      if (!is.null(input_json$`failed`)) {
        if (!(is.numeric(input_json$`failed`) && length(input_json$`failed`) == 1)) {
          stop(paste("Error! Invalid data for `failed`. Must be an integer:", input_json$`failed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for BatchRequestCounts: the required field `failed` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of BatchRequestCounts
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `total` is null
      if (is.null(self$`total`)) {
        return(FALSE)
      }

      # check if the required `completed` is null
      if (is.null(self$`completed`)) {
        return(FALSE)
      }

      # check if the required `failed` is null
      if (is.null(self$`failed`)) {
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
      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
      }

      # check if the required `completed` is null
      if (is.null(self$`completed`)) {
        invalid_fields["completed"] <- "Non-nullable required field `completed` cannot be null."
      }

      # check if the required `failed` is null
      if (is.null(self$`failed`)) {
        invalid_fields["failed"] <- "Non-nullable required field `failed` cannot be null."
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
# BatchRequestCounts$unlock()
#
## Below is an example to define the print function
# BatchRequestCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# BatchRequestCounts$lock()

