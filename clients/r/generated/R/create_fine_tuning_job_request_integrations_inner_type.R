#' @docType class
#' @title CreateFineTuningJobRequestIntegrationsInnerType
#'
#' @description CreateFineTuningJobRequestIntegrationsInnerType Class
#'
#' @format An \code{R6Class} generator object
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CreateFineTuningJobRequestIntegrationsInnerType <- R6::R6Class(
  "CreateFineTuningJobRequestIntegrationsInnerType",
  public = list(
    #' @field actual_instance the object stored in this instance.
    actual_instance = NULL,
    #' @field actual_type the type of the object stored in this instance.
    actual_type = NULL,
    #' @field one_of  a list of types defined in the oneOf schema.
    one_of = list("character"),
    #' Initialize a new CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @description
    #' Initialize a new CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @param instance an instance of the object defined in the oneOf schemas: "character"
    #' @export
    initialize = function(instance = NULL) {
      if (is.null(instance)) {
        # do nothing
      } else if (get(class(instance)[[1]], pos = -1)$classname ==  "character") {
        self$actual_instance <- instance
        self$actual_type <- "character"
      } else {
        stop(paste("Failed to initialize CreateFineTuningJobRequestIntegrationsInnerType with oneOf schemas character. Provided class name: ",
                   get(class(instance)[[1]], pos = -1)$classname))
      }
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #' An alias to the method `fromJSON` .
    #'
    #' @param input The input JSON.
    #' @return An instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #' @export
    fromJSONString = function(input) {
      self$fromJSON(input)
    },
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @description
    #' Deserialize JSON string into an instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @param input The input JSON.
    #' @return An instance of CreateFineTuningJobRequestIntegrationsInnerType.
    #' @export
    fromJSON = function(input) {
      matched <- 0 # match counter
      matched_schemas <- list() #names of matched schemas
      error_messages <- list()
      instance <- NULL

      `character_result` <- tryCatch({
          instance <- jsonlite::fromJSON(input, simplifyVector = FALSE)
          if (typeof(instance) != "character") {
            stop(sprintf("Data type doesn't match. Expected: %s. Actual: %s.", "character", typeof(instance)))
          }
          instance_type <- "character"
          matched_schemas <- append(matched_schemas, "character")
          matched <- matched + 1
        },
        error = function(err) err
      )

      if (!is.null(`character_result`["error"])) {
        error_messages <- append(error_messages, `character_result`["message"])
      }

      if (matched == 1) {
        # successfully match exactly 1 schema specified in oneOf
        self$actual_instance <- instance
        self$actual_type <- instance_type
      } else if (matched > 1) {
        # more than 1 match
        stop(paste("Multiple matches found when deserializing the input into CreateFineTuningJobRequestIntegrationsInnerType with oneOf schemas character. Matched schemas: ",
                   paste(matched_schemas, collapse = ", ")))
      } else {
        # no match
        stop(paste("No match found when deserializing the input into CreateFineTuningJobRequestIntegrationsInnerType with oneOf schemas character. Details: >>",
                   paste(error_messages, collapse = " >> ")))
      }

      self
    },
    #' Serialize CreateFineTuningJobRequestIntegrationsInnerType to JSON string.
    #'
    #' @description
    #' Serialize CreateFineTuningJobRequestIntegrationsInnerType to JSON string.
    #'
    #' @return JSON string representation of the CreateFineTuningJobRequestIntegrationsInnerType.
    #' @export
    toJSONString = function() {
      if (!is.null(self$actual_instance)) {
        as.character(jsonlite::minify(self$actual_instance$toJSONString()))
      } else {
        NULL
      }
    },
    #' Serialize CreateFineTuningJobRequestIntegrationsInnerType to JSON.
    #'
    #' @description
    #' Serialize CreateFineTuningJobRequestIntegrationsInnerType to JSON.
    #'
    #' @return JSON representation of the CreateFineTuningJobRequestIntegrationsInnerType.
    #' @export
    toJSON = function() {
      if (!is.null(self$actual_instance)) {
        self$actual_instance$toJSON()
      } else {
        NULL
      }
    },
    #' Validate the input JSON with respect to CreateFineTuningJobRequestIntegrationsInnerType.
    #'
    #' @description
    #' Validate the input JSON with respect to CreateFineTuningJobRequestIntegrationsInnerType and
    #' throw exception if invalid.
    #'
    #' @param input The input JSON.
    #' @export
    validateJSON = function(input) {
      # backup current values
      actual_instance_bak <- self$actual_instance
      actual_type_bak <- self$actual_type

      # if it's not valid, an error will be thrown
      self$fromJSON(input)

      # no error thrown, restore old values
      self$actual_instance <- actual_instance_bak
      self$actual_type <- actual_type_bak
    },
    #' Returns the string representation of the instance.
    #'
    #' @description
    #' Returns the string representation of the instance.
    #'
    #' @return The string representation of the instance.
    #' @export
    toString = function() {
      jsoncontent <- c(
        sprintf('"actual_instance": %s', if (is.null(self$actual_instance)) NULL else self$actual_instance$toJSONString()),
        sprintf('"actual_type": "%s"', self$actual_type),
        sprintf('"one_of": "%s"', paste(unlist(self$one_of), collapse = ", "))
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      as.character(jsonlite::prettify(paste("{", jsoncontent, "}", sep = "")))
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
#CreateFineTuningJobRequestIntegrationsInnerType$unlock()
#
## Below is an example to define the print function
#CreateFineTuningJobRequestIntegrationsInnerType$set("public", "print", function(...) {
#  print(jsonlite::prettify(self$toJSONString()))
#  invisible(self)
#})
## Uncomment below to lock the class to prevent modifications to the method or field
#CreateFineTuningJobRequestIntegrationsInnerType$lock()

