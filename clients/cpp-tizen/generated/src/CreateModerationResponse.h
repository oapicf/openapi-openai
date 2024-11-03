/*
 * CreateModerationResponse.h
 *
 * Represents if a given text input is potentially harmful.
 */

#ifndef _CreateModerationResponse_H_
#define _CreateModerationResponse_H_


#include <string>
#include "CreateModerationResponse_results_inner.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents if a given text input is potentially harmful.
 *
 *  \ingroup Models
 *
 */

class CreateModerationResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateModerationResponse();
	CreateModerationResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateModerationResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The unique identifier for the moderation request.
	 */
	std::string getId();

	/*! \brief Set The unique identifier for the moderation request.
	 */
	void setId(std::string  id);
	/*! \brief Get The model used to generate the moderation results.
	 */
	std::string getModel();

	/*! \brief Set The model used to generate the moderation results.
	 */
	void setModel(std::string  model);
	/*! \brief Get A list of moderation objects.
	 */
	std::list<CreateModerationResponse_results_inner> getResults();

	/*! \brief Set A list of moderation objects.
	 */
	void setResults(std::list <CreateModerationResponse_results_inner> results);

private:
	std::string id;
	std::string model;
	std::list <CreateModerationResponse_results_inner>results;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateModerationResponse_H_ */
