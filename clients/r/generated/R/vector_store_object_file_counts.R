#' Create a new VectorStoreObjectFileCounts
#'
#' @description
#' VectorStoreObjectFileCounts Class
#'
#' @docType class
#' @title VectorStoreObjectFileCounts
#' @description VectorStoreObjectFileCounts Class
#' @format An \code{R6Class} generator object
#' @field in_progress The number of files that are currently being processed. integer
#' @field completed The number of files that have been successfully processed. integer
#' @field failed The number of files that have failed to process. integer
#' @field cancelled The number of files that were cancelled. integer
#' @field total The total number of files. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VectorStoreObjectFileCounts <- R6::R6Class(
  "VectorStoreObjectFileCounts",
  public = list(
    `in_progress` = NULL,
    `completed` = NULL,
    `failed` = NULL,
    `cancelled` = NULL,
    `total` = NULL,

    #' @description
    #' Initialize a new VectorStoreObjectFileCounts class.
    #'
    #' @param in_progress The number of files that are currently being processed.
    #' @param completed The number of files that have been successfully processed.
    #' @param failed The number of files that have failed to process.
    #' @param cancelled The number of files that were cancelled.
    #' @param total The total number of files.
    #' @param ... Other optional arguments.
    initialize = function(`in_progress`, `completed`, `failed`, `cancelled`, `total`, ...) {
      if (!missing(`in_progress`)) {
        if (!(is.numeric(`in_progress`) && length(`in_progress`) == 1)) {
          stop(paste("Error! Invalid data for `in_progress`. Must be an integer:", `in_progress`))
        }
        self$`in_progress` <- `in_progress`
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
      if (!missing(`cancelled`)) {
        if (!(is.numeric(`cancelled`) && length(`cancelled`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled`. Must be an integer:", `cancelled`))
        }
        self$`cancelled` <- `cancelled`
      }
      if (!missing(`total`)) {
        if (!(is.numeric(`total`) && length(`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", `total`))
        }
        self$`total` <- `total`
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
    #' @return VectorStoreObjectFileCounts as a base R list.
    #' @examples
    #' # convert array of VectorStoreObjectFileCounts (x) to a data frame
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
    #' Convert VectorStoreObjectFileCounts to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VectorStoreObjectFileCountsObject <- list()
      if (!is.null(self$`in_progress`)) {
        VectorStoreObjectFileCountsObject[["in_progress"]] <-
          self$`in_progress`
      }
      if (!is.null(self$`completed`)) {
        VectorStoreObjectFileCountsObject[["completed"]] <-
          self$`completed`
      }
      if (!is.null(self$`failed`)) {
        VectorStoreObjectFileCountsObject[["failed"]] <-
          self$`failed`
      }
      if (!is.null(self$`cancelled`)) {
        VectorStoreObjectFileCountsObject[["cancelled"]] <-
          self$`cancelled`
      }
      if (!is.null(self$`total`)) {
        VectorStoreObjectFileCountsObject[["total"]] <-
          self$`total`
      }
      return(VectorStoreObjectFileCountsObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreObjectFileCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreObjectFileCounts
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`in_progress`)) {
        self$`in_progress` <- this_object$`in_progress`
      }
      if (!is.null(this_object$`completed`)) {
        self$`completed` <- this_object$`completed`
      }
      if (!is.null(this_object$`failed`)) {
        self$`failed` <- this_object$`failed`
      }
      if (!is.null(this_object$`cancelled`)) {
        self$`cancelled` <- this_object$`cancelled`
      }
      if (!is.null(this_object$`total`)) {
        self$`total` <- this_object$`total`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VectorStoreObjectFileCounts in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreObjectFileCounts
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreObjectFileCounts
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`in_progress` <- this_object$`in_progress`
      self$`completed` <- this_object$`completed`
      self$`failed` <- this_object$`failed`
      self$`cancelled` <- this_object$`cancelled`
      self$`total` <- this_object$`total`
      self
    },

    #' @description
    #' Validate JSON input with respect to VectorStoreObjectFileCounts and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `in_progress`
      if (!is.null(input_json$`in_progress`)) {
        if (!(is.numeric(input_json$`in_progress`) && length(input_json$`in_progress`) == 1)) {
          stop(paste("Error! Invalid data for `in_progress`. Must be an integer:", input_json$`in_progress`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObjectFileCounts: the required field `in_progress` is missing."))
      }
      # check the required field `completed`
      if (!is.null(input_json$`completed`)) {
        if (!(is.numeric(input_json$`completed`) && length(input_json$`completed`) == 1)) {
          stop(paste("Error! Invalid data for `completed`. Must be an integer:", input_json$`completed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObjectFileCounts: the required field `completed` is missing."))
      }
      # check the required field `failed`
      if (!is.null(input_json$`failed`)) {
        if (!(is.numeric(input_json$`failed`) && length(input_json$`failed`) == 1)) {
          stop(paste("Error! Invalid data for `failed`. Must be an integer:", input_json$`failed`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObjectFileCounts: the required field `failed` is missing."))
      }
      # check the required field `cancelled`
      if (!is.null(input_json$`cancelled`)) {
        if (!(is.numeric(input_json$`cancelled`) && length(input_json$`cancelled`) == 1)) {
          stop(paste("Error! Invalid data for `cancelled`. Must be an integer:", input_json$`cancelled`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObjectFileCounts: the required field `cancelled` is missing."))
      }
      # check the required field `total`
      if (!is.null(input_json$`total`)) {
        if (!(is.numeric(input_json$`total`) && length(input_json$`total`) == 1)) {
          stop(paste("Error! Invalid data for `total`. Must be an integer:", input_json$`total`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreObjectFileCounts: the required field `total` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VectorStoreObjectFileCounts
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `in_progress` is null
      if (is.null(self$`in_progress`)) {
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

      # check if the required `cancelled` is null
      if (is.null(self$`cancelled`)) {
        return(FALSE)
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
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
      # check if the required `in_progress` is null
      if (is.null(self$`in_progress`)) {
        invalid_fields["in_progress"] <- "Non-nullable required field `in_progress` cannot be null."
      }

      # check if the required `completed` is null
      if (is.null(self$`completed`)) {
        invalid_fields["completed"] <- "Non-nullable required field `completed` cannot be null."
      }

      # check if the required `failed` is null
      if (is.null(self$`failed`)) {
        invalid_fields["failed"] <- "Non-nullable required field `failed` cannot be null."
      }

      # check if the required `cancelled` is null
      if (is.null(self$`cancelled`)) {
        invalid_fields["cancelled"] <- "Non-nullable required field `cancelled` cannot be null."
      }

      # check if the required `total` is null
      if (is.null(self$`total`)) {
        invalid_fields["total"] <- "Non-nullable required field `total` cannot be null."
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
# VectorStoreObjectFileCounts$unlock()
#
## Below is an example to define the print function
# VectorStoreObjectFileCounts$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VectorStoreObjectFileCounts$lock()

