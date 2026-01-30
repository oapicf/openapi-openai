/*
 * BatchRequestInput.h
 *
 * The per-line object of the batch input file
 */

#ifndef _BatchRequestInput_H_
#define _BatchRequestInput_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The per-line object of the batch input file
 *
 *  \ingroup Models
 *
 */

class BatchRequestInput : public Object {
public:
	/*! \brief Constructor.
	 */
	BatchRequestInput();
	BatchRequestInput(char* str);

	/*! \brief Destructor.
	 */
	virtual ~BatchRequestInput();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
	 */
	std::string getCustomId();

	/*! \brief Set A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
	 */
	void setCustomId(std::string  custom_id);
	/*! \brief Get The HTTP method to be used for the request. Currently only `POST` is supported.
	 */
	std::string getMethod();

	/*! \brief Set The HTTP method to be used for the request. Currently only `POST` is supported.
	 */
	void setMethod(std::string  method);
	/*! \brief Get The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
	 */
	std::string getUrl();

	/*! \brief Set The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
	 */
	void setUrl(std::string  url);

private:
	std::string custom_id;
	std::string method;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _BatchRequestInput_H_ */
