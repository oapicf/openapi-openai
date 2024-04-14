/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * API version: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// FineTuningAPIController binds http requests to an api service and writes the service results to the http response
type FineTuningAPIController struct {
	service FineTuningAPIServicer
	errorHandler ErrorHandler
}

// FineTuningAPIOption for how the controller is set up.
type FineTuningAPIOption func(*FineTuningAPIController)

// WithFineTuningAPIErrorHandler inject ErrorHandler into controller
func WithFineTuningAPIErrorHandler(h ErrorHandler) FineTuningAPIOption {
	return func(c *FineTuningAPIController) {
		c.errorHandler = h
	}
}

// NewFineTuningAPIController creates a default api controller
func NewFineTuningAPIController(s FineTuningAPIServicer, opts ...FineTuningAPIOption) Router {
	controller := &FineTuningAPIController{
		service:      s,
		errorHandler: DefaultErrorHandler,
	}

	for _, opt := range opts {
		opt(controller)
	}

	return controller
}

// Routes returns all the api routes for the FineTuningAPIController
func (c *FineTuningAPIController) Routes() Routes {
	return Routes{
		"CancelFineTuningJob": Route{
			strings.ToUpper("Post"),
			"/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel",
			c.CancelFineTuningJob,
		},
		"CreateFineTuningJob": Route{
			strings.ToUpper("Post"),
			"/v1/fine_tuning/jobs",
			c.CreateFineTuningJob,
		},
		"ListFineTuningEvents": Route{
			strings.ToUpper("Get"),
			"/v1/fine_tuning/jobs/{fine_tuning_job_id}/events",
			c.ListFineTuningEvents,
		},
		"ListFineTuningJobCheckpoints": Route{
			strings.ToUpper("Get"),
			"/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints",
			c.ListFineTuningJobCheckpoints,
		},
		"ListPaginatedFineTuningJobs": Route{
			strings.ToUpper("Get"),
			"/v1/fine_tuning/jobs",
			c.ListPaginatedFineTuningJobs,
		},
		"RetrieveFineTuningJob": Route{
			strings.ToUpper("Get"),
			"/v1/fine_tuning/jobs/{fine_tuning_job_id}",
			c.RetrieveFineTuningJob,
		},
	}
}

// CancelFineTuningJob - Immediately cancel a fine-tune job. 
func (c *FineTuningAPIController) CancelFineTuningJob(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fineTuningJobIdParam := params["fine_tuning_job_id"]
	if fineTuningJobIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tuning_job_id"}, nil)
		return
	}
	result, err := c.service.CancelFineTuningJob(r.Context(), fineTuningJobIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// CreateFineTuningJob - Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
func (c *FineTuningAPIController) CreateFineTuningJob(w http.ResponseWriter, r *http.Request) {
	createFineTuningJobRequestParam := CreateFineTuningJobRequest{}
	d := json.NewDecoder(r.Body)
	d.DisallowUnknownFields()
	if err := d.Decode(&createFineTuningJobRequestParam); err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	if err := AssertCreateFineTuningJobRequestRequired(createFineTuningJobRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	if err := AssertCreateFineTuningJobRequestConstraints(createFineTuningJobRequestParam); err != nil {
		c.errorHandler(w, r, err, nil)
		return
	}
	result, err := c.service.CreateFineTuningJob(r.Context(), createFineTuningJobRequestParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListFineTuningEvents - Get status updates for a fine-tuning job. 
func (c *FineTuningAPIController) ListFineTuningEvents(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	fineTuningJobIdParam := params["fine_tuning_job_id"]
	if fineTuningJobIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tuning_job_id"}, nil)
		return
	}
	var afterParam string
	if query.Has("after") {
		param := query.Get("after")

		afterParam = param
	} else {
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 20
		limitParam = param
	}
	result, err := c.service.ListFineTuningEvents(r.Context(), fineTuningJobIdParam, afterParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListFineTuningJobCheckpoints - List checkpoints for a fine-tuning job. 
func (c *FineTuningAPIController) ListFineTuningJobCheckpoints(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	fineTuningJobIdParam := params["fine_tuning_job_id"]
	if fineTuningJobIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tuning_job_id"}, nil)
		return
	}
	var afterParam string
	if query.Has("after") {
		param := query.Get("after")

		afterParam = param
	} else {
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 10
		limitParam = param
	}
	result, err := c.service.ListFineTuningJobCheckpoints(r.Context(), fineTuningJobIdParam, afterParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// ListPaginatedFineTuningJobs - List your organization's fine-tuning jobs 
func (c *FineTuningAPIController) ListPaginatedFineTuningJobs(w http.ResponseWriter, r *http.Request) {
	query, err := parseQuery(r.URL.RawQuery)
	if err != nil {
		c.errorHandler(w, r, &ParsingError{Err: err}, nil)
		return
	}
	var afterParam string
	if query.Has("after") {
		param := query.Get("after")

		afterParam = param
	} else {
	}
	var limitParam int32
	if query.Has("limit") {
		param, err := parseNumericParameter[int32](
			query.Get("limit"),
			WithParse[int32](parseInt32),
		)
		if err != nil {
			c.errorHandler(w, r, &ParsingError{Err: err}, nil)
			return
		}

		limitParam = param
	} else {
		var param int32 = 20
		limitParam = param
	}
	result, err := c.service.ListPaginatedFineTuningJobs(r.Context(), afterParam, limitParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}

// RetrieveFineTuningJob - Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
func (c *FineTuningAPIController) RetrieveFineTuningJob(w http.ResponseWriter, r *http.Request) {
	params := mux.Vars(r)
	fineTuningJobIdParam := params["fine_tuning_job_id"]
	if fineTuningJobIdParam == "" {
		c.errorHandler(w, r, &RequiredError{"fine_tuning_job_id"}, nil)
		return
	}
	result, err := c.service.RetrieveFineTuningJob(r.Context(), fineTuningJobIdParam)
	// If an error occurred, encode the error with the status code
	if err != nil {
		c.errorHandler(w, r, err, &result)
		return
	}
	// If no error, encode the body and the result code
	EncodeJSONResponse(result.Body, &result.Code, w)
}
