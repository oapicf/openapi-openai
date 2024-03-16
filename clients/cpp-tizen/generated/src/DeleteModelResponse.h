/*
 * DeleteModelResponse.h
 *
 * 
 */

#ifndef _DeleteModelResponse_H_
#define _DeleteModelResponse_H_


#include <string>
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

class DeleteModelResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	DeleteModelResponse();
	DeleteModelResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeleteModelResponse();

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
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	bool getDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);

private:
	std::string id;
	std::string object;
	bool deleted;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeleteModelResponse_H_ */
