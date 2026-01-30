/*
 * BatchRequestOutput.h
 *
 * The per-line object of the batch output and error files
 */

#ifndef _BatchRequestOutput_H_
#define _BatchRequestOutput_H_


#include <string>
#include "BatchRequestOutput_error.h"
#include "BatchRequestOutput_response.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The per-line object of the batch output and error files
 *
 *  \ingroup Models
 *
 */

class BatchRequestOutput : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchRequestOutput();
	BatchRequestOutput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchRequestOutput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get A developer-provided per-request id that will be used to match outputs to inputs.
	 */
	std::string getCustomId();

	/*! \brief Set A developer-provided per-request id that will be used to match outputs to inputs.
	 */
	void setCustomId(std::string  custom_id);
	/*! \brief Get 
	 */
	BatchRequestOutput_response getResponse();

	/*! \brief Set 
	 */
	void setResponse(BatchRequestOutput_response  response);
	/*! \brief Get 
	 */
	BatchRequestOutput_error getError();

	/*! \brief Set 
	 */
	void setError(BatchRequestOutput_error  error);

private:
	std::string id;
	std::string custom_id;
	BatchRequestOutput_response response;
	BatchRequestOutput_error error;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BatchRequestOutput_H_ */
