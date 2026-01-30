#' Create a new CreateAssistantRequestToolResourcesFileSearch
#'
#' @description
#' CreateAssistantRequestToolResourcesFileSearch Class
#'
#' @docType class
#' @title CreateAssistantRequestToolResourcesFileSearch
#' @description CreateAssistantRequestToolResourcesFileSearch Class
#' @format An \code{R6Class} generator object
#' @field vector_store_ids The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant. list(character) [optional]
#' @field vector_stores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant. list(\link{CreateAssistantRequestToolResourcesFileSearchVectorStoresInner}) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateAssistantRequestToolResourcesFileSearch <- R6::R6Class(
  "CreateAssistantRequestToolResourcesFileSearch",
  public = list(
    `vector_store_ids` = NULL,
    `vector_stores` = NULL,

    #' @description
    #' Initialize a new CreateAssistantRequestToolResourcesFileSearch class.
    #'
    #' @param vector_store_ids The [vector store](/docs/api-reference/vector-stores/object) attached to this assistant. There can be a maximum of 1 vector store attached to the assistant.
    #' @param vector_stores A helper to create a [vector store](/docs/api-reference/vector-stores/object) with file_ids and attach it to this assistant. There can be a maximum of 1 vector store attached to the assistant.
    #' @param ... Other optional arguments.
    initialize = function(`vector_store_ids` = NULL, `vector_stores` = NULL, ...) {
      if (!is.null(`vector_store_ids`)) {
        stopifnot(is.vector(`vector_store_ids`), length(`vector_store_ids`) != 0)
        sapply(`vector_store_ids`, function(x) stopifnot(is.character(x)))
        self$`vector_store_ids` <- `vector_store_ids`
      }
      if (!is.null(`vector_stores`)) {
        stopifnot(is.vector(`vector_stores`), length(`vector_stores`) != 0)
        sapply(`vector_stores`, function(x) stopifnot(R6::is.R6(x)))
        self$`vector_stores` <- `vector_stores`
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
    #' @return CreateAssistantRequestToolResourcesFileSearch as a base R list.
    #' @examples
    #' # convert array of CreateAssistantRequestToolResourcesFileSearch (x) to a data frame
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
    #' Convert CreateAssistantRequestToolResourcesFileSearch to a base R type
    #'
    #' @return A base R type, e.g. a list or numeric/character array.
    toSimpleType = function() {
      CreateAssistantRequestToolResourcesFileSearchObject <- list()
      if (!is.null(self$`vector_store_ids`)) {
        CreateAssistantRequestToolResourcesFileSearchObject[["vector_store_ids"]] <-
          self$`vector_store_ids`
      }
      if (!is.null(self$`vector_stores`)) {
        CreateAssistantRequestToolResourcesFileSearchObject[["vector_stores"]] <-
          lapply(self$`vector_stores`, function(x) x$toSimpleType())
      }
      return(CreateAssistantRequestToolResourcesFileSearchObject)
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResourcesFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResourcesFileSearch
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`vector_store_ids`)) {
        self$`vector_store_ids` <- ApiClient$new()$deserializeObj(this_object$`vector_store_ids`, "array[character]", loadNamespace("openapi"))
      }
      if (!is.null(this_object$`vector_stores`)) {
        self$`vector_stores` <- ApiClient$new()$deserializeObj(this_object$`vector_stores`, "array[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #' 
    #' @param ... Parameters passed to `jsonlite::toJSON`
    #' @return CreateAssistantRequestToolResourcesFileSearch in JSON format
    toJSONString = function(...) {
      simple <- self$toSimpleType()
      json <- jsonlite::toJSON(simple, auto_unbox = TRUE, digits = NA, ...)
      return(as.character(jsonlite::minify(json)))
    },

    #' @description
    #' Deserialize JSON string into an instance of CreateAssistantRequestToolResourcesFileSearch
    #'
    #' @param input_json the JSON input
    #' @return the instance of CreateAssistantRequestToolResourcesFileSearch
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`vector_store_ids` <- ApiClient$new()$deserializeObj(this_object$`vector_store_ids`, "array[character]", loadNamespace("openapi"))
      self$`vector_stores` <- ApiClient$new()$deserializeObj(this_object$`vector_stores`, "array[CreateAssistantRequestToolResourcesFileSearchVectorStoresInner]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to CreateAssistantRequestToolResourcesFileSearch and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of CreateAssistantRequestToolResourcesFileSearch
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      if (length(self$`vector_store_ids`) > 1) {
        return(FALSE)
      }

      if (length(self$`vector_stores`) > 1) {
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
      if (length(self$`vector_store_ids`) > 1) {
        invalid_fields["vector_store_ids"] <- "Invalid length for `vector_store_ids`, number of items must be less than or equal to 1."
      }

      if (length(self$`vector_stores`) > 1) {
        invalid_fields["vector_stores"] <- "Invalid length for `vector_stores`, number of items must be less than or equal to 1."
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
# CreateAssistantRequestToolResourcesFileSearch$unlock()
#
## Below is an example to define the print function
# CreateAssistantRequestToolResourcesFileSearch$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# CreateAssistantRequestToolResourcesFileSearch$lock()

