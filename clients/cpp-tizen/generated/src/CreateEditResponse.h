/*
 * CreateEditResponse.h
 *
 * 
 */

#ifndef _CreateEditResponse_H_
#define _CreateEditResponse_H_


#include <string>
#include "CreateCompletionResponse_usage.h"
#include "CreateEditResponse_choices_inner.h"
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

class CreateEditResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateEditResponse();
	CreateEditResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateEditResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	int getCreated();

	/*! \brief Set 
	 */
	void setCreated(int  created);
	/*! \brief Get 
	 */
	std::list<CreateEditResponse_choices_inner> getChoices();

	/*! \brief Set 
	 */
	void setChoices(std::list <CreateEditResponse_choices_inner> choices);
	/*! \brief Get 
	 */
	CreateCompletionResponse_usage getUsage();

	/*! \brief Set 
	 */
	void setUsage(CreateCompletionResponse_usage  usage);

private:
	std::string object;
	int created;
	std::list <CreateEditResponse_choices_inner>choices;
	CreateCompletionResponse_usage usage;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateEditResponse_H_ */
