/*
 * CreateModerationResponse.h
 *
 * 
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


/*! \brief 
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

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getModel();

	/*! \brief Set 
	 */
	void setModel(std::string  model);
	/*! \brief Get 
	 */
	std::list<CreateModerationResponse_results_inner> getResults();

	/*! \brief Set 
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
