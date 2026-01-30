/*
 * Batch_request_counts.h
 *
 * The request counts for different statuses within the batch.
 */

#ifndef _Batch_request_counts_H_
#define _Batch_request_counts_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The request counts for different statuses within the batch.
 *
 *  \ingroup Models
 *
 */

class Batch_request_counts : public Object {
public:
	/*! \brief Constructor.
	 */
	Batch_request_counts();
	Batch_request_counts(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Batch_request_counts();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Total number of requests in the batch.
	 */
	int getTotal();

	/*! \brief Set Total number of requests in the batch.
	 */
	void setTotal(int  total);
	/*! \brief Get Number of requests that have been completed successfully.
	 */
	int getCompleted();

	/*! \brief Set Number of requests that have been completed successfully.
	 */
	void setCompleted(int  completed);
	/*! \brief Get Number of requests that have failed.
	 */
	int getFailed();

	/*! \brief Set Number of requests that have failed.
	 */
	void setFailed(int  failed);

private:
	int total;
	int completed;
	int failed;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Batch_request_counts_H_ */
