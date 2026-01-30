#' Create a new VectorStoreExpirationAfter
#'
#' @description
#' The expiration policy for a vector store.
#'
#' @docType class
#' @title VectorStoreExpirationAfter
#' @description VectorStoreExpirationAfter Class
#' @format An \code{R6Class} generator object
#' @field anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`. character
#' @field days The number of days after the anchor time that the vector store will expire. integer
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
VectorStoreExpirationAfter <- R6::R6Class(
  "VectorStoreExpirationAfter",
  public = list(
    `anchor` = NULL,
    `days` = NULL,

    #' @description
    #' Initialize a new VectorStoreExpirationAfter class.
    #'
    #' @param anchor Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
    #' @param days The number of days after the anchor time that the vector store will expire.
    #' @param ... Other optional arguments.
    initialize = function(`anchor`, `days`, ...) {
      if (!missing(`anchor`)) {
        if (!(`anchor` %in% c("last_active_at"))) {
          stop(paste("Error! \"", `anchor`, "\" cannot be assigned to `anchor`. Must be \"last_active_at\".", sep = ""))
        }
        if (!(is.character(`anchor`) && length(`anchor`) == 1)) {
          stop(paste("Error! Invalid data for `anchor`. Must be a string:", `anchor`))
        }
        self$`anchor` <- `anchor`
      }
      if (!missing(`days`)) {
        if (!(is.numeric(`days`) && length(`days`) == 1)) {
          stop(paste("Error! Invalid data for `days`. Must be an integer:", `days`))
        }
        self$`days` <- `days`
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
    #' @return VectorStoreExpirationAfter as a base R list.
    #' @examples
    #' # convert array of VectorStoreExpirationAfter (x) to a data frame
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
    #' Convert VectorStoreExpirationAfter to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      VectorStoreExpirationAfterObject <- list()
      if (!is.null(self$`anchor`)) {
        VectorStoreExpirationAfterObject[["anchor"]] <-
          self$`anchor`
      }
      if (!is.null(self$`days`)) {
        VectorStoreExpirationAfterObject[["days"]] <-
          self$`days`
      }
      return(VectorStoreExpirationAfterObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreExpirationAfter
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreExpirationAfter
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`anchor`)) {
        if (!is.null(this_object$`anchor`) && !(this_object$`anchor` %in% c("last_active_at"))) {
          stop(paste("Error! \"", this_object$`anchor`, "\" cannot be assigned to `anchor`. Must be \"last_active_at\".", sep = ""))
        }
        self$`anchor` <- this_object$`anchor`
      }
      if (!is.null(this_object$`days`)) {
        self$`days` <- this_object$`days`
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return VectorStoreExpirationAfter in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of VectorStoreExpirationAfter
    #'
    #' @param input_json the JSON input
    #' @return the instance of VectorStoreExpirationAfter
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`anchor`) && !(this_object$`anchor` %in% c("last_active_at"))) {
        stop(paste("Error! \"", this_object$`anchor`, "\" cannot be assigned to `anchor`. Must be \"last_active_at\".", sep = ""))
      }
      self$`anchor` <- this_object$`anchor`
      self$`days` <- this_object$`days`
      self
    },

    #' @description
    #' Validate JSON input with respect to VectorStoreExpirationAfter and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
      # check the required field `anchor`
      if (!is.null(input_json$`anchor`)) {
        if (!(is.character(input_json$`anchor`) && length(input_json$`anchor`) == 1)) {
          stop(paste("Error! Invalid data for `anchor`. Must be a string:", input_json$`anchor`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreExpirationAfter: the required field `anchor` is missing."))
      }
      # check the required field `days`
      if (!is.null(input_json$`days`)) {
        if (!(is.numeric(input_json$`days`) && length(input_json$`days`) == 1)) {
          stop(paste("Error! Invalid data for `days`. Must be an integer:", input_json$`days`))
        }
      } else {
        stop(paste("The JSON input `", input, "` is invalid for VectorStoreExpirationAfter: the required field `days` is missing."))
      }
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of VectorStoreExpirationAfter
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      # check if the required `anchor` is null
      if (is.null(self$`anchor`)) {
        return(FALSE)
      }

      # check if the required `days` is null
      if (is.null(self$`days`)) {
        return(FALSE)
      }

      if (self$`days` > 365) {
        return(FALSE)
      }
      if (self$`days` < 1) {
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
      # check if the required `anchor` is null
      if (is.null(self$`anchor`)) {
        invalid_fields["anchor"] <- "Non-nullable required field `anchor` cannot be null."
      }

      # check if the required `days` is null
      if (is.null(self$`days`)) {
        invalid_fields["days"] <- "Non-nullable required field `days` cannot be null."
      }

      if (self$`days` > 365) {
        invalid_fields["days"] <- "Invalid value for `days`, must be smaller than or equal to 365."
      }
      if (self$`days` < 1) {
        invalid_fields["days"] <- "Invalid value for `days`, must be bigger than or equal to 1."
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
# VectorStoreExpirationAfter$unlock()
#
## Below is an example to define the print function
# VectorStoreExpirationAfter$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# VectorStoreExpirationAfter$lock()

